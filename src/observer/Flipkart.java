package observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();

    public void addSubscriber(OrderPlacedSubscriber subscriber) {
        orderPlacedSubscribers.add(subscriber);
    }

    public void removeSubscriber(OrderPlacedSubscriber subscriber) {
        orderPlacedSubscribers.remove(subscriber);
    }

    public void orderPlaced(Order order) {
        for(OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers) {
            orderPlacedSubscriber.onOrderPlaced(order);
        }
    }
}
