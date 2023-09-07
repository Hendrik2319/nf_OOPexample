package org.example.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StudentsCSV {
/*
	•	Schaue dir die Datei students.csv an. Kopiere die Datei in das Root-Verzeichnis deines Projektes.
	     ->     https://neuefische.github.io/java-curriculum/3-Ecosystem/03-Stream/res/students.csv
	•	Nutze Streams, um die Datei zeilenweise einzulesen und auszugeben (Tipp: Files.lines(Path.of("students.csv")))
	•	Entferne dabei die Überschrift
	•	Wandel die Zeilen jeweils in die Klasse Student um
	•	Entferne ungültige Zeilen und Duplikate
 */
    public static void main(String[] args) {
        List<String> lines = List.of(); // empty List

        try (Stream<String> stream = Files.lines(Path.of("students.csv"))) {
            lines = new ArrayList<>(stream.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!lines.isEmpty())
            lines.remove(0);

        lines.stream()
            .filter(str -> !str.isBlank())
            .distinct()
            .map(Student::parse)
            .forEach(System.out::println);
    }

    private record Student(int id, String name, int zipCode, int age) {

        static Student parse(String str) {
            if (str==null) return null;

            String[] parts = str.split(",");
            if (parts.length!=4) { System.out.printf("Line has wrong number of fields: \"%s\"%n", str); return null; }

            Integer id = parseInt(parts[0]);
            if (id==null) { System.out.printf("Can't parse [id] field: \"%s\" in \"%s\"%n", parts[0], str); return null; }

            String name = parts[1];

            Integer zipCode = parseInt(parts[2]);
            if (zipCode==null) { System.out.printf("Can't parse [zipCode] field: \"%s\" in \"%s\"%n", parts[2], str); return null; }

            Integer age = parseInt(parts[3]);
            if (age==null) { System.out.printf("Can't parse [age] field: \"%s\" in \"%s\"%n", parts[2], str); return null; }

            return new Student(id, name, zipCode, age);
        }

        private static Integer parseInt(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                return null;
            }
        }

    }
}
