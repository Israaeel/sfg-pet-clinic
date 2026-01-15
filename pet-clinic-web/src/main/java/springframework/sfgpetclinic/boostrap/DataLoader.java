package springframework.sfgpetclinic.boostrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springframework.sfgpetclinic.model.Owner;
import springframework.sfgpetclinic.services.OwnerService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    public DataLoader(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Israel");
        owner1.setLastName("Silva");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Joao");
        owner2.setLastName("Silva");
        ownerService.save(owner2);

        System.out.println("Dados carregados com sucesso!");
    }
}
