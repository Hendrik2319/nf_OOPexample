package org.example.mapsandsets;

public class Main {
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
    public static void main(String[] args) {

        Apotheke apotheke = new Apotheke();
        apotheke.printStorage();

        apotheke.save(new Medication("Med1", 12.5, 300));
        apotheke.save(new Medication("Med2", 500.99, 10));
        apotheke.save(new Medication("Med3", 10, 30));
        apotheke.save(new Medication("Med4", 125, 200));
        apotheke.save(new Medication("Med5", 1.25, 6000));
        System.out.println();
        System.out.println("Med1..Med5 added");
        apotheke.printStorage();

        apotheke.delete("Med3");
        apotheke.delete("Med4");
        System.out.println();
        System.out.println("Med3 & Med4 removed");
        apotheke.printStorage();

        apotheke.setAvailability("Med2", 1);
        System.out.println();
        System.out.println("Avalibility of Med2 set to 1");
        apotheke.printStorage();
    }
}
