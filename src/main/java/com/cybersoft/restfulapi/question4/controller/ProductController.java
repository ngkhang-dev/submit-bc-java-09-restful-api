package com.cybersoft.restfulapi.question4.controller;

import com.cybersoft.restfulapi.question4.dto.ProductDTO;
import com.cybersoft.restfulapi.question4.model.Product;
import com.cybersoft.restfulapi.question4.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getList() {
        return productService.getList();
    }

    @GetMapping("/{id}")
    public Product getDetail(@PathVariable String id) {
        try {
            int idNumber = Integer.parseInt(id);
            return productService.getById(idNumber);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("id must be number");
        }
    }

    @PostMapping
    public Product create(@RequestBody ProductDTO productDTO) {
        return productService.create(productDTO);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable String id, @RequestBody ProductDTO productDTO) {
        try {
            int idNumber = Integer.parseInt(id);
            return productService.update(idNumber, productDTO);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Product ID must be number");
        }
    }

    @DeleteMapping("/{id}")
    public Product delete(@PathVariable String id) {
        try {
            int idNumber = Integer.parseInt(id);
            return productService.delete(idNumber);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Product ID must be number");
        }
    }

}
