package com.learn.crudapi.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.learn.crudapi.Model.Book;

@Service
public class BookServiceImp implements BookService {

    // Store In Hashmap
    private Map<Integer, Book> bookMap = new HashMap<>();

    @Override
    public Map<Integer, Book> readbook() {
        return bookMap;
    }

    @Override
    public Book readbookbyid(int id) {
        Book book = bookMap.get(id);

        return book;

    }

    @Override
    public String savebook(Book book) {
        bookMap.put(book.getId(), book);
        return " Book Is Stored";
    }

    @Override
    public String updatebook(int id, Book book) {
        Book existinggBook = bookMap.get(id);

        if (existinggBook!=null) {
            
            if (book.getId()==0) {
                existinggBook.setId(book.getId());
            }

            if (book.getName()!=null) {
                existinggBook.setName(book.getName());
            }
            if (book.getAuthername()!=null) {

                existinggBook.setAuthername(book.getAuthername());
                
            }
            return "update";
        }else{
            return "not update";
        }
    } 

    @Override
    public String deletebook(int id) {

        if (bookMap.containsKey(id)) {
            bookMap.remove(id);
            return "Delete Book Succefully";
        }
        return "Id Not Found ";

    }

}
