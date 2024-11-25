package com.example.cart.service;

import com.example.cart.model.Product;
import com.example.cart.repository.ProductRepository;
import com.example.cart.service.IProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product decreaseQuantity(long id) {
        Product product = findById(id);
        if (product != null && product.getQuantity() > 0) {
            product.setQuantity(product.getQuantity() - 1);
            return productRepository.save(product);
        }
        return null;
    }
}