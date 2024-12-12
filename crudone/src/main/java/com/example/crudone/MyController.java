package com.example.crudone;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class MyController {
    
    @GetMapping("get")
    public static String userData(){
         return "GetData from Data";
    }

    @PutMapping("put")
    public static String putMethodName() {
       
         return "PutData from the Put mapping ";
    }
    
    @PostMapping("post")
    public String postMethodName() {
       
        
        return "post";
    }
    @DeleteMapping("dekete")
    public static String  deleteMenthod(){
        return "delete";
    }
}
