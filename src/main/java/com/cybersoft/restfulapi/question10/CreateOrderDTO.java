package com.cybersoft.restfulapi.question10;

import com.cybersoft.restfulapi.question10.model.Product;

import java.util.List;

public class CreateOrderDTO {
    private String customerName;
    private List<Product> products;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
