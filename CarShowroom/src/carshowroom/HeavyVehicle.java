/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshowroom;


public class HeavyVehicle extends Vehicle{
    
    private int weight;
    
    /**
     * Constructor for HeavyVehicle
     */

    public HeavyVehicle() {
    }

    /**
     * Constructor for HeavyVehicle
     * 
     * @param modelNumber
     * @param enginePower
     * @param tireSize
     * @param weight
     */
    public HeavyVehicle(String modelNumber, double enginePower, double tireSize, int weight) {
        super(modelNumber, "Diesel", enginePower, tireSize);
        this.weight = weight;
    }
    
    
    
    /**
     * Prints details of a heavy vehicle
     *
     */
    @Override
    public void printVehicle() {
        super.printVehicle(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Weight: "+weight);
    }
    
}
