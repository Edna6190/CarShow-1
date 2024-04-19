package com.ajBinary.reository;

import org.springframework.data.repository.CrudRepository;
import com.ajBinary.entity.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}

