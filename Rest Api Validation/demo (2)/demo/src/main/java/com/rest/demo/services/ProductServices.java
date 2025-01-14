package com.rest.demo.services;



import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rest.demo.model.ProductModel;
import com.rest.demo.repository.ProductRepo;

@Service
public  interface ProductServices{
    
        ResponseEntity<Object>createproduct(ProductModel productModel);
    
}