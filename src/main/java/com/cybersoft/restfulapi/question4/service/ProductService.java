package com.cybersoft.restfulapi.question4.service;

import com.cybersoft.restfulapi.question4.dto.ProductDTO;
import com.cybersoft.restfulapi.question4.model.Product;
import com.cybersoft.restfulapi.question4.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getList() {
        return productRepository.findAll();
    }

    public Product getById(int id) {
        return productRepository.findById(id);
    }

    public Product create(ProductDTO productDTO) {
        validate(productDTO);

        Product newProduct = new Product(0, productDTO.getName(), productDTO.getPrice(),
                productDTO.getQuantity());

        return productRepository.create(newProduct);
    }

    public Product update(int id, ProductDTO productDTO) {
        Product existingProduct = productRepository.findById(id);
        if (existingProduct == null) {
            return null;
        }

        Product sameName = productRepository.findByName(productDTO.getName());

        validate(productDTO);

        Product updatedProduct = new Product();
        updatedProduct.setId(id);
        updatedProduct.setName(productDTO.getName());
        updatedProduct.setPrice(productDTO.getPrice());
        updatedProduct.setQuantity(productDTO.getQuantity());

        return productRepository.update(updatedProduct);
    }

    public Product delete(int id) {
        return productRepository.delete(id);
    }

    private void validate(ProductDTO dto) {
        if (dto.getName() == null || dto.getName().isBlank()) {
            throw new IllegalArgumentException("Name is required");
        }
        if (dto.getPrice() == null || dto.getPrice().compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Price must not be negative");
        }
        if (dto.getQuantity() < 0) {
            throw new IllegalArgumentException("Quantity must not be negative");
        }
    }
}
