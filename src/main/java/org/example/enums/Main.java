package org.example.enums;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        PersonRepository repo = new PersonRepository();
        repo.addPerson(new Person("P1", "Person1", DaysOfWeek.WEDNESDAY));
        repo.addPerson(new Person("P2", "Person2", DaysOfWeek.FRIDAY));
        repo.addPerson(new Person("P3", "Person3", DaysOfWeek.SATURDAY));

        Optional<Person> p1 = repo.getPerson("P1");
        Optional<Person> p4 = repo.getPerson("P4");

        if (p1.isPresent())
            System.out.printf("P1: Lieblingstag von %s ist %s.", p1.get().name(), p1.get().favoriteDay());
        if (p4.isPresent())
            System.out.printf("P4: Lieblingstag von %s ist %s.", p4.get().name(), p4.get().favoriteDay());

    }

    private static String getDay(DaysOfWeek dayOfWeek) {
        if (dayOfWeek.compareTo(DaysOfWeek.SATURDAY)>=0)
            return "Wochenende";
        else
            return dayOfWeek.toString();
    }
}
