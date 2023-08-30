package org.example.vehicles;

public class Motorbike extends Vehicle {

    protected String bikeType;

    public Motorbike(String brand, String model, int productionYear, String bikeType) {
        super(brand, model, productionYear);
        this.bikeType = bikeType;
    }

    @Override
    public void writeInfo(String label) {
        super.writeInfo(label);
        System.out.println("  bike type: "+bikeType);
    }
}
