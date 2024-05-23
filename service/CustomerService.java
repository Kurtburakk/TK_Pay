package tk_pay.service;

import java.util.HashMap;
import java.util.Map;

import tk_pay.model.Customer;
import tk_pay.model.FriendRequest;

public class CustomerService {
    private Map<Long, Customer> customerMap = new HashMap<>();

    public Customer addCustomer(Customer customer) {
        customerMap.put(customer.getId(), customer);
        return customer;
    }

    public Customer getCustomerById(Long id) {
        return customerMap.get(id);
    }

    public void sendFriendRequest(Customer sender, Customer receiver) {
        FriendRequest friendRequest = new FriendRequest(sender, receiver);
        sender.getSentFriendRequests().add(friendRequest);
        receiver.getReceivedFriendRequests().add(friendRequest);
    }
}
