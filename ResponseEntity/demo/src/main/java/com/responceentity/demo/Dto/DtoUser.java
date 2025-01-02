package com.responceentity.demo.Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="responseEntity")
public class DtoUser {


    @Id
    private int id;
    
    private String name;
}
