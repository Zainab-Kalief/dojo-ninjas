package com.wura.dojo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wura.dojo.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {

}
