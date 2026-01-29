package service.impl;

import domain.*;
import exceptions.*;
import repository.*;
import service.BankService;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class BankServiceImpl implements BankService {

    private final AccountRepository accountRepo = new AccountRepository();
    private final CustomerRepository customerRepo = new CustomerRepository();
    private final TransactionRepository txRepo = new TransactionRepository();

    @Override
    public String openAccount(String name, String email, String type) {

        if (name == null || name.isBlank())
            throw new ValidationException("Name required");

        if (!type.equalsIgnoreCase("SAVINGS")
                && !type.equalsIgnoreCase("CURRENT"))
            throw new ValidationException("Invalid type");

        String customerId = UUID.randomUUID().toString();
        customerRepo.save(new Customer(email, customerId, name));

        String accNo = "AC" + UUID.randomUUID().toString().substring(0, 6);
        accountRepo.save(new Account(accNo, type, 0.0, customerId));

        return accNo;
    }

    @Override
    public void deposit(String acc, Double amt, String note) {
        if (amt <= 0) throw new ValidationException("Invalid amount");

        Account a = getAccount(acc);
        a.setBalance(a.getBalance() + amt);

        txRepo.add(new Transaction(
                acc,
                amt,
                UUID.randomUUID().toString(),
                note,
                LocalDateTime.now(),
                Type.DEPOSIT
        ));

    }

    @Override
    public void withdraw(String acc, Double amt, String note) {
        Account a = getAccount(acc);
        if (a.getBalance() < amt)
            throw new InsufficientFundsException("Low balance");

        a.setBalance(a.getBalance() - amt);
        txRepo.add(new Transaction(
                acc,
                amt,
                UUID.randomUUID().toString(),
                note,
                LocalDateTime.now(),
                Type.WITHDRAW
        ));
        
    }

    @Override
    public void transfer(String from, String to, Double amt, String note) {

        if (from.equals(to))
            throw new ValidationException("Cannot transfer to same account");

        Account source = getAccount(from);
        Account target = getAccount(to);

        if (source.getBalance() < amt)
            throw new InsufficientFundsException("Low balance");

        source.setBalance(source.getBalance() - amt);
        target.setBalance(target.getBalance() + amt);

        txRepo.add(new Transaction(
                from,
                amt,
                UUID.randomUUID().toString(),
                "Transfer to " + to,
                LocalDateTime.now(),
                Type.TRANSFER_OUT
        ));

        txRepo.add(new Transaction(
                to,
                amt,
                UUID.randomUUID().toString(),
                "Transfer from " + from,
                LocalDateTime.now(),
                Type.TRANSFER_IN
        ));
    }


    @Override
    public List<Account> listAccounts() {
        return accountRepo.findAll();
    }

    @Override
    public List<Transaction> getStatement(String acc) {
        return txRepo.findByAccount(acc);
    }

    @Override
    public List<Account> searchAccountsByCustomerName(String q) {
        return customerRepo.findAll().stream()
                .filter(c -> c.getName().toLowerCase().contains(q.toLowerCase()))
                .flatMap(c -> accountRepo.findByCustomerId(c.getId()).stream())
                .collect(Collectors.toList());
    }

    private Account getAccount(String acc) {
        return accountRepo.findByNumber(acc)
                .orElseThrow(() -> new AccountNotFoundException("Not found"));
    }
}
