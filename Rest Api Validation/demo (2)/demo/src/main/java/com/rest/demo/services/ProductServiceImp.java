package com.rest.demo.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.rest.demo.dto.ProductDto;
import com.rest.demo.model.ProductModel;
import com.rest.demo.repository.ProductRepo;

public class ProductServiceImp  implements ProductServices {

        @Autowired
        ProductRepo productRepo;

        //  dependacy Injeaction In the Constructore
        ProductServiceImp(ProductRepo productRepo){
            this.productRepo=productRepo;
        }


    @Override
    public ResponseEntity<Object> createproduct(ProductModel productModel) {
        
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(productModel, productDto);
        productRepo.save(productDto);
        
        
        throw new UnsupportedOperationException("Unimplemented method 'createproduct'");
    }
    
}
