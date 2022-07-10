package db;

import model.Order;
import model.Product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderRepoTest {

    @Test
    void testAdd() {

        //Given
        OrderRepo orderRepo = new OrderRepo();

        //when
        orderRepo.addOrder(new Order("order1", List.of(
                new Product("1", "Samsung"),
                new Product("2", "Nokia")
        )));

        //then
        assertTrue(orderRepo.listOrders().contains(new Order("order1", List.of(
                new Product("1", "Samsung"),
                new Product("2", "Nokia")
        ))));

    }
    private void assertTrue(boolean contains){

    }

    @Test
    void testListOrders(){
        //Given
        OrderRepo orderRepo=new OrderRepo();
        orderRepo.addOrder(new Order("order1", List.of(
                new Product("1", "Samsung"),
                new Product("2", "Nokia")
        )));

        orderRepo.addOrder(new Order("order2", List.of(
                new Product("1", "Samsung"),
                new Product("3", "Iphone")
        )));

        //when
        List<Order> actual=orderRepo.listOrders();

        //then
        assertthat();
    }

}
