/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshowroom;


public class SportsVehicle extends Vehicle{

    private String turbo;
    
    /**
     * Constructor for SportsVehicle
     */
    public SportsVehicle() {
    }

    /**
     * Cosntructor for SportsVehicle
     * 
     * @param modelNumber
     * @param enginePower
     * @param tireSize
     * @param turbo
     */
    public SportsVehicle(String modelNumber, double enginePower, double tireSize, String turbo) {
        super(modelNumber, "Oil", enginePower, tireSize);
        this.turbo = turbo;
    }

    /**
     * Prints details of a sports vehicle
     */
    @Override
    public void printVehicle() {
        super.printVehicle(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Turbo: "+turbo);
    }

    
    
    
}
