package com.example.product.service;

import com.example.product.model.Products;


import java.util.Optional;

public interface IProductsService {
    Iterable<Products> findAllProducts();
    Optional<Products> findProductsById(Long id);
}