package com.maldonadopublisher.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.maldonadopublisher.springwebapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    
}
