package org.example.mapsandsets;

public class Medication {
    /*
        Schritt 1: Erstellt eine Klasse '' mit den Methoden 'getName', 'getPrice' und 'getAvailability'.
        Schritt 2: Lege eine Java-Klasse 'Apotheke' an, die eine Java-Map verwendet, um den Medication Namen
                   als Schlüssel und deren Informationen als Werte zu speichern. Implementiere Methoden, um
                   Medication zur Map hinzuzufügen, Informationen abzurufen und die Verfügbarkeit zu aktualisieren.
        Schritt 3: Lege eine Methode 'int getCount()' in der Klasse `Apotheke` an. Diese Methode sollte die Anzahl
                   der Medication in der Apotheke zurückgeben.
        Schritt 4: Lege eine Methode 'void save(Medication medication)' in der Klasse `Apotheke` an. Diese Methode
                   sollte das Medication indexiert nach seinem Namen in die Apotheke einfügen.
        Schritt 5: Lege eine Methode 'Medication find(String medicationName)' in der Klasse `Apotheke` an. Diese
                   Methode sollte die gesuchte Medication mit diesem Namen zurückgeben. Falls keine Medication mit
                   diesem Namen gefunden wird, sollte die Methode null zurückgeben.
        Schritt 6: Lege eine Methode 'void delete(String medicationName)' in der Klasse `Apotheke` an. Diese Methode
                   sollte die Medication mit diesem Namen löschen.
        Schritt 7: Implementiere eine Methode, um alle Medication in der Map auszugeben, einschließlich ihres Namens,
                   Preises und der Verfügbarkeit.
     */

    private final String name;
    private double price;
    private int availability;

    public Medication(String name, double price, int availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    @SuppressWarnings("unused")
    public double getPrice() {
        return price;
    }

    @SuppressWarnings("unused")
    public void setPrice(double price) {
        this.price = price;
    }

    @SuppressWarnings("unused")
    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public void printValues(String indent) {
        System.out.println(indent+"name: "+name);
        System.out.println(indent+"price: "+price);
        System.out.println(indent+"availability: "+availability);
    }
}
