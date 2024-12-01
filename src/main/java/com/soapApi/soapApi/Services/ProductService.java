package com.soapApi.soapApi.Services;

import com.api.spring.soap.CreateProductRequest;
import com.api.spring.soap.CreateProductResponse;
import com.api.spring.soap.ServiceStatus;
import com.soapApi.soapApi.Model.ProductEntity;
import com.soapApi.soapApi.Respositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public CreateProductResponse createProduct(CreateProductRequest productRequest){

        // saving incoming request to the database  via the product entity
        ProductEntity product = new ProductEntity();
        product.setProduct(productRequest.getProduct());
        product.setPrice(productRequest.getPrice());
        product.setLocation(productRequest.getLocation());
        product.setStock(productRequest.isStock());
        productRepository.save(product);

        // sending back response in xml format to the client
        CreateProductResponse response = new CreateProductResponse();
        ServiceStatus status = new ServiceStatus();
        status.setMessage("Product created successfully");
        status.setStatus(200);
        response.setResponseStatus(status);
        return response;
    }
}