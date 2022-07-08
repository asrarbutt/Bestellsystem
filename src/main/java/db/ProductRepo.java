package db;

import model.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductRepo {

    Map<String, Product> products=new HashMap<>();


    public ProductRepo(Map<String, Product> products) {
        this.products = products;
    }

    public Map<String, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
