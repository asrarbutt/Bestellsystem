package db;

import model.Product;

import java.util.*;

public class ProductRepo {

    private final List<Product> products;

    public ProductRepo(List<Product> products) {
        this.products = products;
    }


    // get product method only one Product
    public Product getProduct(String productId) {

        for (Product product : products) {
            if (product.getId().equals(productId)) {
                return product;
            }
        }
        throw new NoSuchElementException("Prduct with id: " + productId + " not found!");

    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }
}
