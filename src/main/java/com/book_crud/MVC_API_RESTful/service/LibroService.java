package com.book_crud.MVC_API_RESTful.service;

import com.book_crud.MVC_API_RESTful.model.Book;

import java.util.List;

public interface LibroService {
    public List<Book> findAll();
    public Book findById(Integer id);
    public Book save(Book book);
    public void delete(Integer id);
}
