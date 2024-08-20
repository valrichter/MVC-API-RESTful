package com.book_crud.MVC_API_RESTful.service;

import com.book_crud.MVC_API_RESTful.model.Book;
import com.book_crud.MVC_API_RESTful.repository.BookRepository;

import java.util.List;

public class BookServiceImp implements BookService {

    private final BookRepository bookRepository;

    // Dependency Injection
    public BookServiceImp(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public Book findById(Integer id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(Integer id) {
        bookRepository.deleteById(id);
    }
}
