package com.maldonadopublisher.repositories;

import org.springframework.data.repository.CrudRepository;

import com.maldonadopublisher.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    
}
