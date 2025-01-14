package com.rest.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.demo.dto.ProductDto;

@Repository
public interface  ProductRepo extends JpaRepository<ProductDto,Integer> {
    
}
