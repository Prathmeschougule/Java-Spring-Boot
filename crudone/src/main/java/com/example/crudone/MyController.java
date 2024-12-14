package com.example.crudone;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

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
   
   @PutMapping("path/{id}")
   public Book updateBook(@PathVariable int id, @RequestBody Book  updateBook) {
      Book exitstingBook=booksMap.get(id); 
      exitstingBook.setId(updateBook.getId());
      exitstingBook.setTitle(updateBook.getTitle());
      exitstingBook.setAuther(updateBook.getAuther());
     
       return exitstingBook;
   }

  @DeleteMapping("book/{id}")
  public String deleteBook(@PathVariable int id ){

      booksMap.remove(id);
      return "The Id Is Deleted ";
  }
   
   
}
