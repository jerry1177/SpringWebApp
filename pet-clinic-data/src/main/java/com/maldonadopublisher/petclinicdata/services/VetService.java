package com.maldonadopublisher.petclinicdata.services;

import com.maldonadopublisher.petclinicdata.model.Vet;

public interface VetService extends CrudService<Vet, Long> {
    
    Vet findByLastName(String lastName);
    
}
