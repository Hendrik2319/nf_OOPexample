package org.example.vehicles;

public class Car extends Vehicle {

    protected int doorCount;

    public Car(String brand, String model, int productionYear, int doorCount) {
        super(brand, model, productionYear);
        this.doorCount = doorCount;
    }

    @Override
    public void writeInfo(String label) {
        super.writeInfo(label);
        System.out.println("  door count: "+doorCount);
    }
}
