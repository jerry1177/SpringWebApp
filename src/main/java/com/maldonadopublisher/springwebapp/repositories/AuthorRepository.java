package com.maldonadopublisher.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.maldonadopublisher.springwebapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{
    
}
