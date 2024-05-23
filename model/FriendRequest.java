package tk_pay.model;

public class FriendRequest {
    private static long idCounter = 0;

    private Long id;
    private Customer sender;
    private Customer receiver;
    private boolean isAccepted;

    public FriendRequest(Customer sender, Customer receiver) {
        this.id = ++idCounter;
        this.sender = sender;
        this.receiver = receiver;
        this.isAccepted = false;
    }

    public Long getId() {
        return id;
    }

    public Customer getSender() {
        return sender;
    }

    public Customer getReceiver() {
        return receiver;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }
}
