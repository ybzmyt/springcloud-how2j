package com.thc.productdataservice.pojo;

import lombok.Data;

@Data
public class Product {

    private Integer id;
    private String name;
    private Integer price;

    public Product(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}