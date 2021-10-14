package com.igor.personapi.service;

import com.igor.personapi.dto.response.MessageResponseDTO;
import com.igor.personapi.model.Person;
import com.igor.personapi.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {
    private final PersonRepository personRepository;

    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Person successfully created with ID " + savedPerson.getId())
                .build();
    }
}
