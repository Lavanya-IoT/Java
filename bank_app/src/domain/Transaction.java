package domain;

import java.time.LocalDateTime;

public class Transaction {

    private String id;
    private String accountNumber;
    private Double amount;
    private LocalDateTime timestamp;
    private Type type;
    private String note;

    public Transaction(String accountNumber,
                       Double amount,
                       String id,
                       String note,
                       LocalDateTime timestamp,
                       Type type) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.id = id;
        this.note = note;
        this.timestamp = timestamp;
        this.type = type;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Type getType() {
        return type;
    }

    public String getNote() {
        return note;
    }
}
