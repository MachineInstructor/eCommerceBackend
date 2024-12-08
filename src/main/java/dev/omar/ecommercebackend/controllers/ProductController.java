package dev.omar.ecommercebackend.controllers;

import dev.omar.ecommercebackend.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return null;
    }

    @GetMapping("/product/{id}")
    public Product getSingleProduct(@PathVariable("id") int id) {
        return null;
    }

    @PostMapping
    public Product createProduct() {
        return null;
    }
}
