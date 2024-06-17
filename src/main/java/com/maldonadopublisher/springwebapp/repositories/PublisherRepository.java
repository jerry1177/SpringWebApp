package com.maldonadopublisher.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.maldonadopublisher.springwebapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
    
}
