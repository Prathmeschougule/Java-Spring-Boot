package com.dbtestsecound_project.practisecrud;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "prathmesh")
public class User {
    @Id
    private   int id;
    private String name;

  
}
