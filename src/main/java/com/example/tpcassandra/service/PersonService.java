package com.example.tpcassandra.service;

import com.example.tpcassandra.models.Person;
import com.example.tpcassandra.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor @NoArgsConstructor
public class PersonService {

    private PersonRepository personRepository;

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public Optional<Person> findById(String id) {
        return personRepository.findById(id);
    }

    public Iterable<Person> findAll() {
        return personRepository.findAll();
    }

    public void deleteById(String id) {
        personRepository.deleteById(id);
    }
}

