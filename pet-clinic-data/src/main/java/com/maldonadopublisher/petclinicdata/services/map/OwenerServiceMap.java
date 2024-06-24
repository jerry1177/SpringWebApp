package com.maldonadopublisher.petclinicdata.services.map;

import com.maldonadopublisher.petclinicdata.model.Owner;

public class OwenerServiceMap extends AbstractMapService<Owner, Long>{

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

}
