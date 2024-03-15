package org.example;

public class Vehicle {

    private String Manufactorer;
    private String Model;
    private int yearOfManufacture;

    public String getManufactorer() {
        return Manufactorer;
    }

    public void setManufactorer(String manufactorer) {
        Manufactorer = manufactorer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }


}