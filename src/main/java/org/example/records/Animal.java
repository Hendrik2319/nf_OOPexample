package org.example.records;

@SuppressWarnings("unused")
public record Animal(String id, String name, Species species, double age, Owner owner) {
    public Animal withID     ( String  id      ) { return new Animal(id, name, species, age, owner); }
    public Animal withName   ( String  name    ) { return new Animal(id, name, species, age, owner); }
    public Animal withSpecies( Species species ) { return new Animal(id, name, species, age, owner); }
    public Animal withAge    ( double  age     ) { return new Animal(id, name, species, age, owner); }
    public Animal withOwner  ( Owner   owner   ) { return new Animal(id, name, species, age, owner); }
}
