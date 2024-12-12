package com.example.crud;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class MyController {
    

    @GetMapping("path")
    public String getMethodName() {
        return "Get";
    }
    
    @PostMapping("path")
    public String postMethodName() {
        //TODO: process POST request
        
        return "Post";
    }
    @PutMapping("Phase/{id}")
    public String putMethodName() {
        //TODO: process PUT request
        
        return "Put";
    }
    
    @DeleteMapping("Phase/{id}")
    public String deleteMethodItem(){
        return "Delete";
    }
    
}
