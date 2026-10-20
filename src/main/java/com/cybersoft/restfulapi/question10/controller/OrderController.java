package com.cybersoft.restfulapi.question10.controller;

import com.cybersoft.restfulapi.question10.CreateOrderDTO;
import com.cybersoft.restfulapi.question10.model.Order;
import com.cybersoft.restfulapi.question10.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<List<Order>> getListOrders() {
        List<Order> res = orderService.getListOrders();

        return ResponseEntity.ok(res);
    }

    @PostMapping
    public ResponseEntity<String> addOrder(@RequestBody CreateOrderDTO createOrderDTO) {
        boolean isSuccess = orderService.addOrder(createOrderDTO);

        if (!isSuccess) {
            return ResponseEntity.badRequest().body("Order already exists");
        }
        return ResponseEntity.ok("Order added successfully");
    }
}
