package com.soapApi.soapApi.Services;

import com.api.spring.soap.GetProductRequest;
import com.api.spring.soap.GetProductResponse;
import com.api.spring.soap.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public GetProductResponse createProduct(GetProductRequest request){
        Product product = new Product();
        product.setProduct(request.getProduct());
        product.setPrice(request.getPrice());
        product.setLocation(request.getLocation());
        product.setStock(request.isStock());
        product.setProductId(123555);

        GetProductResponse productResponse = new GetProductResponse();
        productResponse.setProduct(product);
        return productResponse;
    }
}
