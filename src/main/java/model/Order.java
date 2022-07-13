package model;

import java.util.List;
import java.util.Objects;

public class Order {
    private String orderId;
    private final List<Product> productList;




    public Order(String orderId, List<Product> productList, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.productList = productList;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", productList=" + productList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderId, order.orderId) && Objects.equals(productList, order.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productList);
    }
}
