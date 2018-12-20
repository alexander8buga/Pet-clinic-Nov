package springFramework.petClinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springFramework.petClinic.model.Owner;
import springFramework.petClinic.model.PetType;
import springFramework.petClinic.model.Vet;
import springFramework.petClinic.services.OwnerService;
import springFramework.petClinic.services.PetTypeService;
import springFramework.petClinic.services.VetService;

/**
 * Created by ab on 12/13/18
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private  final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService){
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michal");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("John");
        owner2.setLastName("Doe");

        ownerService.save(owner2);
        System.out.println("Owners got created and loaded....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Roger");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Marry");
        vet2.setLastName("Doe");

        vetService.save(vet2);
        System.out.println("Vets got created and loaded....");


    }
}
