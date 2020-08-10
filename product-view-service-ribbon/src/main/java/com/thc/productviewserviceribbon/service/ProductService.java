package com.thc.productviewserviceribbon.service;
 
import java.util.List;

import com.thc.commonentity.entity.Product;
import com.thc.productviewserviceribbon.cliend.ProductClientRibbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;
    public List<Product> listProducts(){
        return productClientRibbon.listProdcuts();
 
    }
}