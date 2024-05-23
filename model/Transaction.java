package tk_pay.model;

import java.time.LocalDateTime;

public class Transaction {
    private static long idCounter = 0;

    private Long id;
    private double amount;
    private LocalDateTime dateTime;
    private String type; // "SEND" or "RECEIVE"
    private Customer sender;
    private Customer receiver;

    public Transaction(double amount, String type, Customer sender, Customer receiver) {
        this.id = ++idCounter;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
        this.type = type;
        this.sender = sender;
        this.receiver = receiver;
    }

    public Long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getType() {
        return type;
    }

    public Customer getSender() {
        return sender;
    }

    public Customer getReceiver() {
        return receiver;
    }
}
