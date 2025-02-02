package com.rest.demo.services;

import java.util.Map;

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


    @Override
public ResponseEntity<Object> updateUser(ProductModel productModel, int id) {

    if (id == 0) {
        throw new IllegalArgumentException("ID cannot be null");
        
    } 

    try {
        ProductDto productDto = productRepo.findById(id)
                .orElseThrow(() -> new ProductCreationException("Product not found with id: " + id));
        
        productDto.setEmail(productModel.getEmail());
        productDto.setPhone(productModel.getPhone());
        productRepo.save(productDto);
        
        return ResponseEntity.ok(Map.of(
            "message", "Update Data Successfully",
            "updatedProduct", productModel
        ));
    } catch (Exception e) {
        // Log exception
        // logger.error("Error updating product", e);
        throw new ProductCreationException("Failed to update data: " + e.getMessage());
    }
}

    
}
