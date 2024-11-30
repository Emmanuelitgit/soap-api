package com.soapApi.soapApi.Controllers;

import com.api.spring.soap.GetProductRequest;
import com.api.spring.soap.GetProductResponse;
import com.soapApi.soapApi.Services.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ProductController {

    private static final Logger log = LoggerFactory.getLogger(ProductController.class);
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PayloadRoot(namespace = "http://soap.spring.api.com/", localPart = "GetProductRequest")
    @ResponsePayload
    public GetProductResponse createProduct(@RequestPayload GetProductRequest request){
        log.info("in create product method:==============");
        return productService.createProduct(request);
    }
}
