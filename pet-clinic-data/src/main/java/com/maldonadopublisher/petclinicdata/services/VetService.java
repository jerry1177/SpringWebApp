package com.maldonadopublisher.petclinicdata.services;

import org.springframework.stereotype.Service;

import com.maldonadopublisher.petclinicdata.model.Vet;

@Service
public interface VetService extends CrudService<Vet, Long> {
    
    Vet findByLastName(String lastName);
    
}
