package com.example.product.service;

import com.example.product.model.Products;
import com.example.product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductsService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Iterable<Products> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Products> findProductsById(Long id) {
        return productRepository.findById(id);
    }
}