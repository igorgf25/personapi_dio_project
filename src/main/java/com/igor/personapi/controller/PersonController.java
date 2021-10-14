package com.igor.personapi.controller;

import com.igor.personapi.dto.MessagePersonDTO;
import com.igor.personapi.model.Person;
import com.igor.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @PostMapping
    public MessagePersonDTO createPerson(@RequestBody Person person){
        Person savedPerson = personRepository.save(person);
        return MessagePersonDTO
                .builder()
                .message("Created person with ID" + savedPerson.getId())
                .build();
    }
}
