package org.example.records;

public class Main {

    public static void main(String[] args) {

        Owner owner1 = new Owner("Hendrik", 47, "Wohnstraße 54, 12345 Ort");
        Owner owner2 = new Owner("Klaus", 60, "Hauptstraße 12, 12345 Irgendwo");
        Owner owner3 = new Owner("Hendrik", 47, "Wohnstraße 54, 12345 Ort");

        Species worms = new Species("Worms", 30.0);
        Species chimps = new Species("Chimps", 1500.0);
        Species turtles = new Species("Turtles", 500.0);

        Animal anim1  = new Animal("w1", "Worm 1", worms, 0.1, owner1);
        Animal anim2  = new Animal("a1", "Ape 1", chimps, 8, owner1);
        Animal anim3  = new Animal("t1", "Turtle 1", turtles, 3, owner2);
        Animal anim3a = new Animal("t2", "Turtle 2", turtles, 3, owner2);
        Animal anim4  = new Animal("w1", "Worm 1", worms, 0.1, owner3);

        System.out.println("anim1 : " + anim1);
        System.out.println("anim2 : " + anim2);
        System.out.println("anim3 : " + anim3);
        System.out.println("anim3a: " + anim3a);
        System.out.println("anim4 : " + anim4);
        System.out.println("anim1.equals( anim2 ) -> " + anim1.equals(anim2));
        System.out.println("anim1.equals( anim4 ) -> " + anim1.equals(anim4));

        System.out.println();

        Zoo zoo = new Zoo("Tierpark Berlin");
        zoo.animals().add(anim1 );
        zoo.animals().add(anim2 );
        zoo.addAnimal(anim3 );
        zoo.addAnimal(anim3a);
        zoo.animals().add(anim4 );
        zoo.printZoo();
        System.out.printf("Total amount of feed: %s g/day%n", zoo.computeTotalFeedAmount());
    }

}
