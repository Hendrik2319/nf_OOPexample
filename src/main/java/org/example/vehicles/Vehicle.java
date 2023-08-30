package org.example.vehicles;

@SuppressWarnings("unused")
public class Vehicle {
    protected String brand;
    protected String model;
    protected int productionYear;

    public Vehicle(String brand, String model, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void writeInfo(String label) {
        System.out.println(label+":");
        System.out.println("  brand: "+brand);
        System.out.println("  model: "+model);
        System.out.println("  production year: "+productionYear);
    }
}
