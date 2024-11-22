package com.example.cart.service;



import com.example.cart.model.Products;

import java.util.Optional;

public interface IProductsService {
    Iterable<Products> findAllProducts();
    Optional<Products> findProductsById(Long id);
}