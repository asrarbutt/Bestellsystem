package service;

import db.OrderRepo;
import db.ProductRepo;
import model.Order;
import model.OrderStatus;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShopService {
    private final ProductRepo productRepo;
    private final OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    //All product as list
    public List<Product> allProducts() {
        return productRepo.getProducts();
    }

    //all Orders
    public List<Order> allOrders() {
        return orderRepo.listOrders();
    }

    //order Products

    public Order orderProducts(List<String> productsIds, String id) {
        List<Product> productToOrder = new ArrayList<>();

        for (String productId : productsIds) {
            Product productToAdd = getProduct(productId);
            productToOrder.add(productToAdd);
        }
        return orderRepo.addOrder(new Order(id, productToOrder, OrderStatus.RECEIVED));
    }

    //ein Product
    public Product getProduct(String productId) {
        return productRepo.getProduct(productId);

    }

}
