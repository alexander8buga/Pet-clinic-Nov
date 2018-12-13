package springFramework.petClinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springFramework.petClinic.model.Owner;
import springFramework.petClinic.model.Vet;
import springFramework.petClinic.services.OwnerService;
import springFramework.petClinic.services.VetService;
import springFramework.petClinic.services.map.OwnerServiceMap;
import springFramework.petClinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private  final VetService vetService;

    public DataLoader(){
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();

    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michal");
        owner1.setLastName("Weston");

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("John");
        owner2.setLastName("Doe");

        ownerService.save(owner2);
        System.out.println("Owners got created and loaded....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Roger");

        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Marry");
        vet2.setLastName("Doe");

        vetService.save(vet2);
        System.out.println("Vets got created and loaded....");


    }
}
