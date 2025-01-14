package com.rest.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.demo.model.ProductModel;
import com.rest.demo.services.ProductServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("product")
public class Product{
    
    @Autowired
     ProductServices productServices;

    //  dependacy Injecation i costructore

    public Product(ProductServices productServices){
        this.productServices=productServices;
    }

     
    @PostMapping("path")
    public ResponseEntity<Object> postMethodName(  @RequestBody ProductModel  productModel ) {
        //TODO: process POST request
        
        return productServices.createproduct(productModel);
    }
    

}
