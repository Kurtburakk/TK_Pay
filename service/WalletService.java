package tk_pay.service;

import java.util.HashMap;
import java.util.Map;

import tk_pay.model.Customer;
import tk_pay.model.Wallet;

public class WalletService {
    private Map<Long, Wallet> walletMap = new HashMap<>();

    public Wallet createWallet(Customer customer) {
        Wallet wallet = new Wallet(customer);
        walletMap.put(wallet.getId(), wallet);
        customer.getWallets().add(wallet);
        return wallet;
    }

    public void addTyMoney(Customer customer, double amount) {
        Wallet wallet = customer.getWallets().iterator().next();
        wallet.setTyMoney(wallet.getTyMoney() + amount);
    }

    public void spendTyMoney(Customer customer, double amount) {
        Wallet wallet = customer.getWallets().iterator().next();
        if (wallet.getTyMoney() >= amount) {
            wallet.setTyMoney(wallet.getTyMoney() - amount);
        } else {
            throw new IllegalArgumentException("Insufficient THY Money.");
        }
    }

    public void sendTyPoints(Customer sender, Customer receiver, double amount) {
        Wallet senderWallet = sender.getWallets().iterator().next();
        Wallet receiverWallet = receiver.getWallets().iterator().next();

        if (senderWallet.getTyPoints() >= amount) {
            senderWallet.setTyPoints(senderWallet.getTyPoints() - amount);
            receiverWallet.setTyPoints(receiverWallet.getTyPoints() + amount);
        } else {
            throw new IllegalArgumentException("Insufficient THY Points.");
        }
    }
}
