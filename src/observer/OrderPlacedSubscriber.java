package observer;

public interface OrderPlacedSubscriber {
    void onOrderPlaced(Order order);
}
