package tk_pay.service;

import java.util.HashMap;
import java.util.Map;

import tk_pay.model.Customer;
import tk_pay.model.FriendRequest;

public class FriendRequestService {
    private Map<Long, FriendRequest> friendRequestMap = new HashMap<>();

    public void sendFriendRequest(Customer sender, Customer receiver) {
        FriendRequest friendRequest = new FriendRequest(sender, receiver);
        friendRequestMap.put(friendRequest.getId(), friendRequest);
        sender.getSentFriendRequests().add(friendRequest);
        receiver.getReceivedFriendRequests().add(friendRequest);
    }

    public void acceptFriendRequest(FriendRequest friendRequest) {
        friendRequest.setAccepted(true);
    }

    public FriendRequest getFriendRequestById(Long id) {
        return friendRequestMap.get(id);
    }
}
