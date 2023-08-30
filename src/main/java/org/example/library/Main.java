package org.example.library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library(
                new Book[] {
                        new Book("Buch 1", "Autor 1", "XXX-Y-ZZZZZ-AAA-B"),
                        new Book("Buch 2", "Autor 2", "XXX-Y-ZZZZZ-AAA-C"),
                        new Book("Buch 3", "Autor 3", "XXX-Y-ZZZZZ-AAA-D"),
                }
        );

        System.out.println("Die Bibliothek sieht wie folgt aus:");
        System.out.println(library);

        library.addBook(new Book("Bibel", "Ein paar Menschen", "000-0-00000-012-0"));

        System.out.println("Nach der Änderung sieht die Bibliothek wie folgt aus:");
        System.out.println(library);

        Book book = library.removeBook(2);
        System.out.println("Folgendes Buch wurde entfernt:");
        System.out.println(book);
        System.out.println();

        System.out.println("Nach der Änderung sieht die Bibliothek wie folgt aus:");
        System.out.println(library);
    }
}