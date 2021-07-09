/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshowroom;


public class Vehicle {
    
    private String modelNumber;
    private String engineType;
    private double enginePower;
    private double tireSize;

    /**
     * Constructor for Vehicle class
     */
   
    public Vehicle() {
    }

    public Vehicle(String modelNumber, String engineType, double enginePower, double tireSize) {
        this.modelNumber = modelNumber;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.tireSize = tireSize;
    }

    
    
    //All Getters
    public String getModelNumber() {
        return modelNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getTireSize() {
        return tireSize;
    }
    
    
    
    //All Setters
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public void setTireSize(double tireSize) {
        this.tireSize = tireSize;
    }
    
    
    
    
	/**
	 * Prints details of a heavy vehicle
	 *
	 */
    public void printVehicle()
    {
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Engine Type: "+engineType);
        System.out.println("Engine Power: "+enginePower);
        System.out.println("Tire Size: "+ tireSize);
    
    }
}
