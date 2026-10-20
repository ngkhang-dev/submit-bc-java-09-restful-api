package com.cybersoft.restfulapi.question10.service;

import com.cybersoft.restfulapi.question10.CreateOrderDTO;
import com.cybersoft.restfulapi.question10.model.Order;
import com.cybersoft.restfulapi.question10.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getListOrders() {
        return orderRepository.findAll();
    }

    public boolean addOrder(CreateOrderDTO createOrderDTO) {
        return orderRepository.save(createOrderDTO.getCustomerName(), createOrderDTO.getProducts());
    }
}
