package springframework.sfgpetclinic.services;

import org.springframework.stereotype.Service;
import springframework.sfgpetclinic.model.Owner;
import java.util.Set;
import java.util.HashSet;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {

        return super.save(owner.getId(), owner);
    }
}