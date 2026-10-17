package com.cybersoft.restfulapi.question9.repository;

import com.cybersoft.restfulapi.question9.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {

    private static final List<Customer> mockData = new ArrayList<>();

    public CustomerRepository() {
        Customer customer1 = new Customer();
        customer1.setId(0);
        customer1.setName("Customer 1");
        customer1.setPhone("0987654321");

        Customer customer2 = new Customer();
        customer2.setId(1);
        customer2.setName("Customer 2");
        customer2.setPhone("0123456789");

        mockData.addAll(List.of(customer1, customer2));
    }

    public List<Customer> findAll() {
        return mockData;
    }
}
