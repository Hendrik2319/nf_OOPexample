package org.example.dateandtime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        // default
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("now       : "+ now);

        ZonedDateTime in2Weeks = ChronoUnit.WEEKS.addTo(now, 2);
        System.out.println("in 2 Weeks: "+ in2Weeks);

        System.out.println();
        ZonedDateTime sometime = ZonedDateTime.of(2023,10, 10,0,0,0,0, ZoneId.systemDefault());
        int cmp = now.compareTo(sometime);
        System.out.println("Time 1: "+ now);
        System.out.println("   "+ (cmp==0 ? "is equal to" : cmp<0 ? "is before" : "is after"));
        System.out.println("Time 2: "+ sometime);

        System.out.println("Difference: "+ ChronoUnit.DAYS.between(now, sometime)+" day(s)");
        System.out.println();

        // bonus
        Animal anim1 = new Animal("anim1", "Animal 1", LocalDate.of(2019, 9, 11));
        System.out.println("Anim1: "+anim1);
        long days = computeDaysUntilNextBirthday(anim1.dateOfBirth());
        System.out.println("Days until next birthday: "+days);

        // experimenting

        System.out.println();
        try {
            System.out.println(Instant.now().plus(2, ChronoUnit.WEEKS));
        } catch (Exception e) {
            System.out.println("Fehler 1: "+e.getMessage());
        }

        try {
            System.out.println(ChronoUnit.WEEKS.addTo(Instant.now(), 2));
        } catch (Exception e) {
            System.out.println("Fehler 2: "+e.getMessage());
        }

    }

    private static long computeDaysUntilNextBirthday(LocalDate dateOfBirth) {
        LocalDate now = LocalDate.now();
        LocalDate nextBirthday = dateOfBirth.withYear(now.getYear());
        while (now.isAfter(nextBirthday))
            nextBirthday = ChronoUnit.YEARS.addTo(nextBirthday,1);
        return ChronoUnit.DAYS.between(now,nextBirthday);
    }
}
