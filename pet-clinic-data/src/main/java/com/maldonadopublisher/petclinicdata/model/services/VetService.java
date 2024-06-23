package com.maldonadopublisher.petclinicdata.model.services;

import java.util.Set;

import com.maldonadopublisher.petclinicdata.model.Vet;

public interface VetService {
    Vet findById(Long id);
    Vet findByLastName(String lastName);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
