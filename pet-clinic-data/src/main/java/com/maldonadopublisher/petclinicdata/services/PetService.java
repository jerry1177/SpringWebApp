package com.maldonadopublisher.petclinicdata.services;

import java.util.Set;
import com.maldonadopublisher.petclinicdata.model.Pet;

public interface PetService {
    Pet findById(Long id);
    
    Pet save(Pet owner);
    
    Set<Pet> findAll();
}
