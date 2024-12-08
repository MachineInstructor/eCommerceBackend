package dev.omar.ecommercebackend.services;

import dev.omar.ecommercebackend.dtos.CreateProductRequestDTO;
import dev.omar.ecommercebackend.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getSingleProduct(long id);

    Product createProduct(CreateProductRequestDTO createProductRequestDTO);
}
