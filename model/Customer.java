package tk_pay.model;

import java.util.HashSet;
import java.util.Set;

public class Customer {
    private static long idCounter = 0;

    private Long id;
    private String name;
    private String tcKimlikNo;
    private String phoneNumber;
    private Set<Wallet> wallets = new HashSet<>();
    private Set<FriendRequest> sentFriendRequests = new HashSet<>();
    private Set<FriendRequest> receivedFriendRequests = new HashSet<>();

    public Customer(String name, String tcKimlikNo, String phoneNumber) {
        this.id = ++idCounter;
        this.name = name;
        this.tcKimlikNo = tcKimlikNo;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Set<Wallet> getWallets() {
        return wallets;
    }

    public Set<FriendRequest> getSentFriendRequests() {
        return sentFriendRequests;
    }

    public Set<FriendRequest> getReceivedFriendRequests() {
        return receivedFriendRequests;
    }
}
