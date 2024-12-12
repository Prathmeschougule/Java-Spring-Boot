package com.example.crudone;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
public class MyController {
    
    
    private Map<Integer,Book>booksMap= new HashMap<>();

   @GetMapping("Books")
   public Map getMethodBooks() {

    //  Get All The Book 
     return booksMap;
   }

   @PostMapping("Books")
   public Book createBook(@RequestBody Book book) {

    // store the Data in the hashmap
     booksMap.put(book.getId(),book);
       
      return book;
   }
   
//    @PutMapping("path/{id}")
//    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
//        //TODO: process PUT request
       
//        return entity;
//    }
   
}
