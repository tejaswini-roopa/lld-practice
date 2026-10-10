package designpatterns.observer;

public interface OrderPlacedSubscriber {
    void onOrderPlaced(Order order);
}
