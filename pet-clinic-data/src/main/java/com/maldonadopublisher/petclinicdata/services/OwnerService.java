package com.maldonadopublisher.petclinicdata.services;

import com.maldonadopublisher.petclinicdata.model.Owner;
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
   
}
