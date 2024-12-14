package com.learn.crudapi.Service;

import java.util.Map;

import com.learn.crudapi.Model.Book;

public interface BookService {

    Map<Integer, Book> readbook();

    Book readbookbyid(int id);

    String savebook(Book book);

    String updatebook(int id, Book book);

    String deletebook(int id);

}
