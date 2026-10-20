package com.cybersoft.restfulapi.question10.repository;

import com.cybersoft.restfulapi.question10.model.Order;
import com.cybersoft.restfulapi.question10.model.Product;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private final static List<Order> mockData = new ArrayList<>();
    private static int mockIndex = 0;

    public OrderRepository() {

        Product product1 = new Product();
        product1.setId(1);
        product1.setProductName("iPhone Dual");
        product1.setPrice(new BigDecimal(1999.99));
        product1.setQuantity(1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setProductName("iPad");
        product2.setPrice(new BigDecimal(999.99));
        product2.setQuantity(1);

        Order order1 = new Order();
        order1.setId(mockIndex);
        order1.setCustomerName("Nguyễn Khang");
        order1.setListProducts(List.of(product1, product2));

        mockData.add(order1);
        mockIndex++;
    }

    public List<Order> findAll() {
        return mockData;
    }

    public boolean save(String customerName, List<Product> listProducts) {
        Order newOrder = new Order();
        newOrder.setId(mockIndex+1);
        newOrder.setCustomerName(customerName);
        newOrder.setListProducts(listProducts);

        mockData.add(newOrder);
        mockIndex++;
        return true;
    }
}
