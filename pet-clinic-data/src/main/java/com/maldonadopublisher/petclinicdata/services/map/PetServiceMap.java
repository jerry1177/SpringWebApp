package com.maldonadopublisher.petclinicdata.services.map;

import com.maldonadopublisher.petclinicdata.model.Vet;

public class PetServiceMap extends AbstractMapService<Vet, Long> {


    @Override
    public Vet save(Vet object) {
        
        return super.save(object.getId(), object);
    }
}
