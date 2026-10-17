package com.cybersoft.restfulapi.question9.service;

import com.cybersoft.restfulapi.question9.model.Customer;
import com.cybersoft.restfulapi.question9.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getListCustomers() {
        return customerRepository.findAll();
    }
}
