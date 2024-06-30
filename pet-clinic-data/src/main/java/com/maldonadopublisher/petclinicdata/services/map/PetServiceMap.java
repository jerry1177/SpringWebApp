package com.maldonadopublisher.petclinicdata.services.map;

import org.springframework.stereotype.Service;

import com.maldonadopublisher.petclinicdata.model.Pet;
import com.maldonadopublisher.petclinicdata.services.PetService;


@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
        
    }


}
