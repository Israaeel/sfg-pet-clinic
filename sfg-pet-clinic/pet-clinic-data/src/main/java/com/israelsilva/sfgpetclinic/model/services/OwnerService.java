package com.israelsilva.sfgpetclinic.model.services;

import com.israelsilva.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);
}
