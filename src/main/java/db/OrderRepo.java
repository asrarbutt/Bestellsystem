package db;

import model.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderRepo {

    Map<String, Order> orderList=new HashMap<>();

    public OrderRepo(Map<String, Order> orderList) {
        this.orderList = orderList;
    }

    //==add Method
    public void add(Order order){

        orderList.put(order.getOrderId(), order);
    }


    public Map<String, Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(Map<String, Order> orderList) {
        this.orderList = orderList;
    }
}
