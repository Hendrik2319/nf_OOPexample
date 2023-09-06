package org.example.enums;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        PersonRepository repo = new PersonRepository();
        repo.addPerson(new Person("P1", "Person1", Gender.FEMALE, DaysOfWeek.WEDNESDAY));
        repo.addPerson(new Person("P2", "Person2", Gender.MALE, DaysOfWeek.FRIDAY));
        repo.addPerson(new Person("P3", "Person3", Gender.MALE, DaysOfWeek.SATURDAY));
        repo.addPerson(new Person("P4", "Person4", Gender.FEMALE, DaysOfWeek.FRIDAY));
        repo.addPerson(new Person("P5", "Person5", Gender.DIVERSE, DaysOfWeek.FRIDAY));
        repo.addPerson(new Person("P6", "Person6", Gender.DIVERSE, DaysOfWeek.SATURDAY));
        repo.addPerson(new Person("P7", "Person7", Gender.MALE, DaysOfWeek.MONDAY));

        Optional<Person> p1 = repo.getPerson("P1");
        Optional<Person> p0 = repo.getPerson("P0");

        if (p1.isPresent())
            System.out.printf("P1: Lieblingstag von %s ist %s.%n", p1.get().name(), p1.get().favoriteDay());
        else
            System.out.println("P1: nicht gefunden");

        if (p0.isPresent())
            System.out.printf("P0: Lieblingstag von %s ist %s.%n", p0.get().name(), p0.get().favoriteDay());
        else
            System.out.println("P0: nicht gefunden");

        System.out.println("countGenderOfPersons():\r\n   "+repo.countGenderOfPersons());
        System.out.println("findPersonsByFavoriteDay(DaysOfWeek.SATURDAY):\r\n   "+repo.findPersonsByFavoriteDay(DaysOfWeek.SATURDAY));
        System.out.println("Person2: "+repo.findPerson("Person2"));
        System.out.println("Person#: "+repo.findPerson("Person#"));
    }

    private static String getDay(DaysOfWeek dayOfWeek) {
        if (dayOfWeek.compareTo(DaysOfWeek.SATURDAY)>=0)
            return "Wochenende";
        else
            return dayOfWeek.toString();
    }
}
