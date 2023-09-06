package org.example.enums;

import java.util.*;

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

    public Optional<Person> findPerson(String name) {
        for (Person person : persons.values())
            if (person.name().equals(name))
                return Optional.of(person);

        return Optional.empty();
    }

    public List<Person> findPersonsByFavoriteDay(DaysOfWeek favoriteDay) {
        ArrayList<Person> people = new ArrayList<>();

        for (Person person : persons.values())
            if (person.favoriteDay() == favoriteDay)
                people.add(person);

        return people;
    }

    public Map<Gender,Integer> countGenderOfPersons() {
        Map<Gender,Integer> counts = new EnumMap<>(Gender.class);

        for (Person person : persons.values()) {
            Integer n = counts.get(person.gender());
            counts.put(person.gender(), n==null ? 1 : n+1);
        }

        return counts;
    }
}
