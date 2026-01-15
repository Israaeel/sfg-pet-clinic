package springframework.sfgpetclinic.services;

import org.springframework.stereotype.Service;
import springframework.sfgpetclinic.model.Owner;
import java.util.Set;
import java.util.HashSet;

@Service
public class OwnerServiceMap implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return new HashSet<>();
    }

    @Override
    public Owner save(Owner owner) {
        return owner;
    }

    @Override
    public Owner findById(Long id) {
        return null;
    }
}