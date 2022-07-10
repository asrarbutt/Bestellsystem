package db;

import model.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepo {

    private final Map<String, Order> orders = new HashMap<>();

    public List<Order> listOrders() {
        return List.copyOf(orders.values());
    }

    public Map<String, Order> getOrders() {
        return orders;
    }

    public Order addOrder(Order newOrder) {
        orders.put(newOrder.getOrderId(), newOrder);
        return newOrder;

    }
}
