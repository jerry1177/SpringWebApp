package com.maldonadopublisher.petclinicdata.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.maldonadopublisher.petclinicdata.model.Owner;
import com.maldonadopublisher.petclinicdata.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        
        Set<Owner> owners = super.findAll();
        for( Owner owner : owners) {
            if (owner.getLastName().equals(lastName)){
                return owner;
            }
        }
        return null;
    }

}
