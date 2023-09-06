package org.example.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {

    private final Map<String,Person> persons;

    public PersonRepository() {
        this.persons = new HashMap<>();
    }

    public boolean addPerson(Person person) {
        if (persons.containsKey(person.id()))
            return false;
        persons.put(person.id(), person);
        return true;
    }

    public Optional<Person> getPerson(String id) {
        return Optional.ofNullable( persons.get(id) );
    }
}
