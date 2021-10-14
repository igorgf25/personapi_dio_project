package com.igor.personapi.repository;

import com.igor.personapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>{
}
