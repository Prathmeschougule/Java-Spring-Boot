package com.dbtestsecound_project.practisecrud;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity(name="usertb")
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    private   int id;
    private String name;

  
}
