package com.soapApi.soapApi.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "product_tbl")
public class ProductEntity {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    public Long productId;
    @Column
    public String product;
    @Column
    public double price;
    @Column
    public String location;
    @Column
    public boolean stock;

    public ProductEntity() {
    }

    public ProductEntity(String location, double price, String product, Long productId, boolean stock) {
        this.location = location;
        this.price = price;
        this.product = product;
        this.productId = productId;
        this.stock = stock;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }
}