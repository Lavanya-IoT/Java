package app;

import service.BankService;
import service.impl.BankServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankService bankService = new BankServiceImpl();

        boolean running = true;
        System.out.println("Welcome to Console Bank");

        while (running) {
            System.out.println("""
                1) Open Account
                2) Deposit
                3) Withdraw
                4) Transfer
                5) Account Statement
                6) List Accounts
                7) Search Accounts by Customer Name
                0) Exit
            """);

            System.out.print("Choose: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> open(scanner, bankService);
                case "2" -> deposit(scanner, bankService);
                case "3" -> withdraw(scanner, bankService);
                case "4" -> transfer(scanner, bankService);
                case "5" -> statement(scanner, bankService);
                case "6" -> bankService.listAccounts()
                        .forEach(a -> System.out.println(a.getAccountNumber() + " | " + a.getBalance()));
                case "7" -> search(scanner, bankService);
                case "0" -> running = false;
            }
        }
    }

    private static void open(Scanner sc, BankService service) {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Type (SAVINGS/CURRENT): ");
        String type = sc.nextLine();

        String acc = service.openAccount(name, email, type);
        System.out.println("Account created: " + acc);
    }

    private static void deposit(Scanner sc, BankService service) {
        System.out.print("Account: ");
        String acc = sc.nextLine();
        System.out.print("Amount: ");
        double amt = Double.parseDouble(sc.nextLine());
        service.deposit(acc, amt, "Deposit");
    }

    private static void withdraw(Scanner sc, BankService service) {
        System.out.print("Account: ");
        String acc = sc.nextLine();
        System.out.print("Amount: ");
        double amt = Double.parseDouble(sc.nextLine());
        service.withdraw(acc, amt, "Withdraw");
    }

    private static void transfer(Scanner sc, BankService service) {
        System.out.print("From: ");
        String from = sc.nextLine();
        System.out.print("To: ");
        String to = sc.nextLine();
        System.out.print("Amount: ");
        double amt = Double.parseDouble(sc.nextLine());
        service.transfer(from, to, amt, "Transfer");
    }

    private static void statement(Scanner sc, BankService service) {
        System.out.print("Account: ");
        String acc = sc.nextLine();
        service.getStatement(acc)
                .forEach(t -> System.out.println(
                        t.getTimestamp() + " | " + t.getType() + " | " + t.getAmount()
                ));
    }

    private static void search(Scanner sc, BankService service) {
        System.out.print("Search name: ");
        String q = sc.nextLine();
        service.searchAccountsByCustomerName(q)
                .forEach(a -> System.out.println(a.getAccountNumber()));
    }
}
