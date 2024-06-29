package com.maldonadopublisher.petclinicweb.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.maldonadopublisher.petclinicdata.model.Owner;
import com.maldonadopublisher.petclinicdata.model.Vet;
import com.maldonadopublisher.petclinicdata.services.OwnerService;
import com.maldonadopublisher.petclinicdata.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner("Micheal", "Weston");
        owner1.setId(1L);

        ownerService.save(owner1);

        Owner owner2 = new Owner("Fiona", "Glenanne");
        owner2.setId(2L);
        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet("Sam", "Axe");
        vet1.setId(1L);

        vetService.save(vet1);
        Vet vet2 = new Vet("Sammy", "nully");
        vet2.setId(2L);
        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }
    
}
