package dev.omar.ecommercebackend.services;

import dev.omar.ecommercebackend.dtos.CreateProductRequestDTO;
import dev.omar.ecommercebackend.dtos.FakeStoreProductDTO;
import dev.omar.ecommercebackend.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{

    private RestTemplate restTemplate; // using this you can call 3rd party api.

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getSingleProduct(long id) {
        FakeStoreProductDTO fakeStoreProductDTO = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeStoreProductDTO.class);
        return fakeStoreProductDTO.toProduct();
    }

    @Override
    public Product createProduct(CreateProductRequestDTO createProductRequestDTO) {
        return null;
    }

}
