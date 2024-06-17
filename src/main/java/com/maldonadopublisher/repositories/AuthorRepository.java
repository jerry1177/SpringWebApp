package com.maldonadopublisher.repositories;

import org.springframework.data.repository.CrudRepository;

import com.maldonadopublisher.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{
    
}
