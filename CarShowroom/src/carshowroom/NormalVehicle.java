/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshowroom;


public class NormalVehicle extends Vehicle{
    
    
    /**
     * Constructor of NormalVehicle
     */
    public NormalVehicle() {
    }

    /**
     * Constructor of Normal Vehicle
     * 
     * @param modelNumber
     * @param engineType
     * @param enginePower
     * @param tireSize
     */
    public NormalVehicle(String modelNumber, String engineType, double enginePower, double tireSize) {
        super(modelNumber, engineType, enginePower, tireSize);
    }
    
    
    
}
