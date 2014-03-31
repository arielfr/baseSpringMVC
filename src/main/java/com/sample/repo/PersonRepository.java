package com.sample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.model.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
