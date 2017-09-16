package com.wura.dojo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wura.dojo.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {

}
