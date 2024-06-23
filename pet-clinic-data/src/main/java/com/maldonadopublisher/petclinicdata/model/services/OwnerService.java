package com.maldonadopublisher.petclinicdata.model.services;

import java.util.Set;

import com.maldonadopublisher.petclinicdata.model.Owner;

public interface OwnerService {
    Owner findById(Long id);
    Owner findByLastName(String lastName);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
