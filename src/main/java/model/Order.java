package model;

import java.util.List;

public class Order {
    private String orderId;
    private final List<Product> productList;


    public Order(String orderId, List<Product> productList) {
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
}
