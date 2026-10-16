package com.cybersoft.restfulapi.question4.repository;

import com.cybersoft.restfulapi.question4.model.Product;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private final static List<Product> mockData = new ArrayList<>();
    private static int mockIndex;

    public ProductRepository() {
        mockData.add(new Product(0, "name1", new BigDecimal("1000.50"), 10));
        mockData.add(new Product(1, "name2", new BigDecimal("99.99"), 6));
        mockData.add(new Product(2, "name3", new BigDecimal("920.50"), 109));

        mockIndex = 2;
    }

    public List<Product> findAll() {
        return mockData;
    }

    public Product findById(int id) {
        return mockData.stream().filter(prod -> prod.getId() == id).findFirst().orElse(null);
    }

    public Product findByName(String name) {
        return mockData.stream().filter(prod -> prod.getName().trim().equals(name)).findFirst().orElse(null);
    }

    public Product create(Product product) {
        Product newProduct = new Product(mockIndex + 1, product.getName(), product.getPrice(), product.getQuantity());

        mockData.add(newProduct);
        mockIndex++;

        return newProduct;
    }

    public Product update(Product product) {
        Product updatedProduct = findById(product.getId());

        if (updatedProduct == null) {
            throw new IllegalArgumentException("Product not found");
        }

        updatedProduct.setName(product.getName());
        updatedProduct.setPrice(product.getPrice());
        updatedProduct.setQuantity(product.getQuantity());

        return updatedProduct;
    }

    public Product delete(int id) {
        Product removedProduct = findById(id);

        if (removedProduct == null) {
            return null;
        }

        mockData.remove(removedProduct);
        return removedProduct;
    }
}
