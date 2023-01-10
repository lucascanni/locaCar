package com.estiam.lu.locaCar.repository;

import com.estiam.lu.locaCar.domaine.vehicule;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface vehiculeRepository extends CrudRepository<vehicule,Integer> {
    @Bean
    List<vehicule> findAll();
}
