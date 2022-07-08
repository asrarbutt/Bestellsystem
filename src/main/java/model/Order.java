package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Order {
    private String orderId;
    List<Product> productList=new ArrayList<>();



    public Order() {
    }

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

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", productList=" + productList +
                '}';
    }
}
