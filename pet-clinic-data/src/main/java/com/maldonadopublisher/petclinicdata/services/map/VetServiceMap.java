package com.maldonadopublisher.petclinicdata.services.map;


import java.util.Set;

import org.springframework.stereotype.Service;

import com.maldonadopublisher.petclinicdata.model.Vet;
import com.maldonadopublisher.petclinicdata.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findByLastName(String lastName) {
        Set<Vet> owners = super.findAll();
        for( Vet owner : owners) {
            if (owner.getLastName().equals(lastName)){
                return owner;
            }
        }
        return null;
    }
    
}
