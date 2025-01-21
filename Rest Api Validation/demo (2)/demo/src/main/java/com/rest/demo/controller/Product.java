package com.rest.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.demo.model.ProductModel;
import com.rest.demo.services.ProductServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("product")
public class Product{
    
    @Autowired
     ProductServices productServices;

    //  dependacy Injecation i costructore

    public Product(ProductServices productServices){
        this.productServices=productServices;
    }

    @PostMapping
    public ResponseEntity<Object> postMethodName(  @RequestBody ProductModel  productModel ) {
          
        return productServices.createproduct(productModel);
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> getMethodName(@PathVariable int id ) {
        return productServices.getbyiduser(id);
    }
    
    

}
