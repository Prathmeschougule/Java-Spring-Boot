package com.learn.crudapi.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.crudapi.Model.Book;
import com.learn.crudapi.Service.BookService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@Controller
@RequestMapping("books")
public class BookControler {

    // object Creation by Ioc Container
    @Autowired
    BookService bookService;

    @GetMapping
    public Map getMethodName() {
        return bookService.readbook();
    }

    @GetMapping("/{id}")
    public Book getMethodById(@PathVariable int id) {
        return bookService.readbookbyid(id);
    }

    @PostMapping
    public String postMethodName(@RequestBody Book book) {
        return bookService.savebook(book);
    }

    @PutMapping("/{id}")
    public String putMethodName(@PathVariable int id, @RequestBody Book book) {

        return bookService.updatebook(id, book);
    }

    @DeleteMapping("/{id}")
    public String deleteMethod(@PathVariable int id) {
        return bookService.deletebook(id);
    }

}
