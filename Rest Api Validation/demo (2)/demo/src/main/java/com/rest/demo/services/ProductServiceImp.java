package com.rest.demo.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.rest.demo.dto.ProductDto;
import com.rest.demo.exeption.ProductCreationException;
import com.rest.demo.model.ProductModel;
import com.rest.demo.repository.ProductRepo;

@Service
public class ProductServiceImp  implements ProductServices {

        @Autowired
        ProductRepo productRepo;

        //  dependacy Injeaction In the Constructore
        ProductServiceImp(ProductRepo productRepo){
            this.productRepo=productRepo;
        }


    @Override
    public ResponseEntity<Object> createproduct(ProductModel productModel) {
        
        try {
            // Copy properties from ProductModel to ProductDto
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(productModel, productDto);

            // Save to the repository
            productRepo.save(productDto);

            return ResponseEntity.ok("Product created successfully!");
        } catch (Exception e) {
            // Throw a custom exception if creation fails
            throw new ProductCreationException("Failed to create product: " + e.getMessage());
        }
        
    }


    @Override
    public ResponseEntity<Object> getbyiduser(int id) {
       try {

         ProductDto productDto= productRepo.findById(id).get();
         ProductModel productModel= new ProductModel();
         BeanUtils.copyProperties(productDto, productModel);
        
         return ResponseEntity.ok("This is You Find The ID "+productModel);
       } catch (Exception e) {
          throw new ProductCreationException("Failed to find the Id: " + e.getMessage());
       }
    }
    
}
