package com.crudwithdatah2db.dbtest_project;


import jakarta.persistence.Table;
// import jakarta.persistence.Id;

// import org.springframework.data.annotation.Id;
// import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Table(name = "user_tb") // Table name in the database
@Data // Lombok provides Getter, Setter, toString, etc.
public class User {

    @Id
    private int id ;

    private  String name ;
    
 
}
