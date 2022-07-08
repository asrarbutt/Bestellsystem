package db;

import model.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductRepo {

    Map<String, Product> products=new HashMap<>();


    public ProductRepo(Map<String, Product> products) {
        this.products = products;
    }


    //Add method

    public void add(Product product){
        this.getProducts().put(product.getId(), product);
    }

    public Product getOneProduct(){

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
