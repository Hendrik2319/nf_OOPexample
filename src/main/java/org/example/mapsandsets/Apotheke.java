package org.example.mapsandsets;

import java.util.HashMap;
import java.util.Map;

public class Apotheke {
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
    private final Map<String,Medication> storage;

    public Apotheke() {
        storage = new HashMap<>();
    }

    public void save(Medication med) {
        storage.put(med.getName(), med);
    }

    @SuppressWarnings("unused")
    public Medication find(String medName) {
        return storage.get(medName);
    }

    @SuppressWarnings("UnusedReturnValue")
    public Medication delete(String medName) {
        return storage.remove(medName);
    }

    public void setAvailability(String medName, int availability) {
        Medication med = storage.get(medName);
        if (med!=null)
            med.setAvailability(availability);
    }

    @SuppressWarnings("unused")
    public int getCount() {
        return storage.size();
    }

    public void printStorage() {
        System.out.printf("Apotheke: %d meds registered in storage%n", storage.size());
        for (String medname : storage.keySet()) {
            System.out.println("   "+medname);
            storage.get(medname).printValues("      ");
        }
    }
}
