package com.book_crud.MVC_API_RESTful.repository;

import com.book_crud.MVC_API_RESTful.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepo extends CrudRepository<Book, Integer> {

}
