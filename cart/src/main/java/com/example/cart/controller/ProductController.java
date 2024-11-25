package com.example.cart.controller;


import com.example.cart.model.Cart;
import com.example.cart.model.Product;
import com.example.cart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private ProductService productService;

    @ModelAttribute("cart")
    public Cart getCart() {
        return new Cart();
    }


    @GetMapping("")
    public String listAllProducts(Model model) {
        model.addAttribute("products", productService.findAll());
        return "product/list";
    }

    @GetMapping("/addToCart")
    public String showAddForm(@RequestParam("id") Long id, @ModelAttribute("cart") Cart cart) {
        Product product = productService.findById(id);
        cart.addCart(product);
        productService.decreaseQuantity(id);
        return "redirect:/product";
    }
}