package service;

import domain.Account;
import domain.Transaction;
import java.util.List;

public interface BankService {

    String openAccount(String name, String email, String accountType);

    void deposit(String accountNumber, Double amount, String note);
    void withdraw(String accountNumber, Double amount, String note);
    void transfer(String from, String to, Double amount, String note);

    List<Account> listAccounts();
    List<Transaction> getStatement(String account);
    List<Account> searchAccountsByCustomerName(String q);
}
