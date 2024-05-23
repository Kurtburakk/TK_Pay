package tk_pay.service;

import java.util.ArrayList;
import java.util.List;

import tk_pay.model.Customer;
import tk_pay.model.Transaction;

public class TransactionService {
    private List<Transaction> transactions = new ArrayList<>();

    public void recordTransaction(double amount, String type, Customer sender, Customer receiver) {
        Transaction transaction = new Transaction(amount, type, sender, receiver);
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
