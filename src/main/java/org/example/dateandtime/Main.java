package org.example.dateandtime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        ZonedDateTime in2Weeks = ChronoUnit.WEEKS.addTo(now, 2);
        System.out.println(in2Weeks);

        System.out.println();
        ZonedDateTime sometime = ZonedDateTime.of(2023,10, 10,0,0,0,0, ZoneId.systemDefault());
        int cmp = now.compareTo(sometime);
        System.out.printf("Time 1: %s%n   %s%nTime 2: %s%n", now, cmp==0 ? "is equal to" : cmp<0 ? "is before" : "is after", sometime);

        System.out.println("Difference: "+ ChronoUnit.DAYS.between(now, sometime));


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
}
