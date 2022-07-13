package db;

import model.Order;
import model.OrderStatus;
import model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderRepoTest {

    @Test
    void testAdd() {

        //Given
        OrderRepo orderRepo = new OrderRepo();

        //when
        orderRepo.addOrder(new Order("order1", List.of(
                new Product("1", "Samsung"),
                new Product("2", "Nokia")
        ), OrderStatus.RECEIVED));

        //then
        assertTrue(orderRepo.listOrders().contains(new Order("order1", List.of(
                new Product("1", "Samsung"),
                new Product("2", "Nokia")
        ), OrderStatus.IN_DELIVERY)));

    }

    private void assertTrue(boolean contains) {

    }

    @Test
    void testListOrders() {
        //Given
        OrderRepo orderRepo = new OrderRepo();
        orderRepo.addOrder(new Order("order1", List.of(
                new Product("1", "Samsung"),
                new Product("2", "Nokia")
        ), OrderStatus.IN_PROGRESS));

        orderRepo.addOrder(new Order("order2", List.of(
                new Product("1", "Samsung"),
                new Product("3", "Iphone")
        ),OrderStatus.CANCELED));

        //when
        List<Order> actual = orderRepo.listOrders();

        //then
       assertThat(actual, containsInAnyOrder(
               new Order("order1", List.of(
                       new Product("1", "Samsung"),
                       new Product("2", "Nokia")
               ), OrderStatus.COMPLETED),
               new Order("order2", List.of(
                       new Product("1", "Samsung"),
                       new Product("3", "Iphone")
               ), OrderStatus.IN_DELIVERY)
       ));

       assertEquals(2, actual.size());
    }

}
