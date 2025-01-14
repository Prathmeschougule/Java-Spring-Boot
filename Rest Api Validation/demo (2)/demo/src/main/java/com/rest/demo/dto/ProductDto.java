package com.rest.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="productdb")
public class ProductDto {

     
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    
    private  String email;

    private int phone;
    
}
