package com.thc.productviewservicefeign.service;
 
import java.util.List;

import com.thc.commonentity.entity.Product;
import com.thc.productviewservicefeign.client.ProductClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;
    public List<Product> listProducts(){
        return productClientFeign.listProdcuts();
 
    }
}