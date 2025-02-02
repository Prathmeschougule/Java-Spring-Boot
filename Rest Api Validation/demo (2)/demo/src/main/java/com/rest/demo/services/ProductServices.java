package com.rest.demo.services;



import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rest.demo.model.ProductModel;
import com.rest.demo.repository.ProductRepo;

@Service
public  interface ProductServices{
    
        ResponseEntity<Object>createproduct(ProductModel productModel);
        ResponseEntity<Object>getbyiduser(int id );
        ResponseEntity<Object>updateUser(ProductModel productModel,int id);
        ResponseEntity<Object>deleteuser(int id );
        ResponseEntity<Object>getAllProduct();
    
}