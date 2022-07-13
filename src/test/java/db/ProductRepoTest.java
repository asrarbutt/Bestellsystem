package db;


import model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductRepoTest {

    @Test
    void TestListProduct() {
        //Given

        List<Product> products = List.of(new Product("1", "samsung"), new Product("2", "IPhone"), new Product("3", "Nokia"));

        ProductRepo productRepo = new ProductRepo(products);

        //When
        List<Product> actual = productRepo.getProducts();

        //then
        assertEquals(products, actual);

    }

  @Test
    public void testGetProductWithExistingId() {
        //Given

        List<Product> products = List.of(
                new Product("1", "samsung"),
                new Product("2", "IPhone"),
                new Product("3", "Nokia")
        );

        ProductRepo productRepo = new ProductRepo(products);

        //When
        Product actual = productRepo.getProduct("3");
        Product expacted=new Product("3", "Nokia");

        //then
        assertEquals(expacted, actual);

    }

    @Test
    void testGetProductWithNonExistingId(){
        List<Product> products = List.of(
                new Product("1", "samsung"),
                new Product("2", "IPhone"),
                new Product("3", "Nokia")
        );

        ProductRepo productRepo = new ProductRepo(products);

        //When & Then
        try {
            productRepo.getProduct("5");
            Assertions.fail();
        }catch (Exception e){
            Assertions.assertEquals("Prduct with id: 5 not found!", e.getMessage());

        }

    }
}
