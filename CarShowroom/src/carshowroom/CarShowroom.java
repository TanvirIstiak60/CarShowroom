/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshowroom;

import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;

import java.util.Enumeration;

import java.util.Collections;
import java.util.Iterator;


public class CarShowroom {

	//arraylists for different types of vehicles
	private ArrayList<NormalVehicle> normalVehicleList;
   	private ArrayList<SportsVehicle> sportsVehicleList;
   	private ArrayList<HeavyVehicle> heavyVehicleList;
    
    
    private int expectedVistorCount;
    private int visitorIncreaseBySports;
    
    /**
     * Constructor for CarShowroom object
     * 
     * @param expectedVistorCount
     * @param visitorIncreaseBySports
     */
    public CarShowroom(int expectedVistorCount, int visitorIncreaseBySports) {
        this.normalVehicleList = new ArrayList<NormalVehicle>(); // Create an ArrayList object
        this.sportsVehicleList = new ArrayList<SportsVehicle>();
        this.heavyVehicleList = new ArrayList<HeavyVehicle>();
        this.expectedVistorCount = expectedVistorCount;
        this.visitorIncreaseBySports = visitorIncreaseBySports;
        
    }
    
    /**
     * Adds a normal vehicle to the corresponding list
     * 
     * @param nv
     */
     public void addNormalVehicle(NormalVehicle nv){
    
        normalVehicleList.add(nv);
        
    }
    
    
    /**
     * Adds a sports vehicle to the corresponding list
     * 
     * @param sv
     */
    public void addSportsVehicle(SportsVehicle sv){
    
        sportsVehicleList.add(sv);
        
        // increasing expected visitor count after adding a sports car
        expectedVistorCount += visitorIncreaseBySports;
        
    }
    
    
    /**
     * Adds a heavy vehicle to corresponding list
     * 
     * @param hv
     */
    public void addHeavyVehicle(HeavyVehicle hv){
    
        heavyVehicleList.add(hv);
        
    }
    
    /**
     * Removes a normal vehicle from the list given its model number
     *  
     * @param modelNumber
     */
    
    public void removeNormalVehicleByModel(String modelNumber)
    {
        Iterator itr = normalVehicleList.iterator();
        
        //iterating the whole list
        while (itr.hasNext())
        {
            NormalVehicle nv = (NormalVehicle)itr.next();
            if(nv.getModelNumber().equals(modelNumber)) //searching with the model number
                itr.remove(); //remove the one that matches with the given model number
        }
    
    }
    
    /**
     * Removes a sports vehicle from the list given its model number
     * 
     * @param modelNumber
     */

    public void removeSportsVehicleByModel(String modelNumber)
    {
        Iterator itr = sportsVehicleList.iterator();
        
        //iterating the whole list
        while (itr.hasNext())
        {
            SportsVehicle sv = (SportsVehicle)itr.next();
            if(sv.getModelNumber().equals(modelNumber)) //searching with the model number
                itr.remove(); //remove the one that matches with the given model number
        }
    
    }
    
    /**
     * Removes a heavy vehicle from the list given its model number
     * 
     * @param modelNumber
     */
    public void removeHeavyVehicleByModel(String modelNumber)
    {
        Iterator itr = heavyVehicleList.iterator();
        
        //iterating the whole list
        while (itr.hasNext())
        {
            HeavyVehicle hv = (HeavyVehicle)itr.next(); 
            if(hv.getModelNumber().equals(modelNumber)) //searching with the model number
                itr.remove(); //remove the one that matches with the given model number
        }
    
    }
    
    
    
    /**
     * Shows all the vehicles of the showroom
     * 
     */
    public void showAllVehicleList()
    {
        
        
        
        System.out.println("Showing All Vehicles of the Showroom!");
        System.out.println("-------------------------------------");
        
        // calculating total number of vehicles
        int totalVehicleCount = normalVehicleList.size() + sportsVehicleList.size() + heavyVehicleList.size();
        System.out.println("Number of total vehicles of the showroom: " + totalVehicleCount);
        
        System.out.println("");
        
        
        //calling all methods for showing individual vehicle list
        showNormalVehicleList();
        showSportsVehicleList();
        showHeavyVehicleList();
    
    }
    
    
    /**
     * Shows all normal vehicles
     * 
     */
    public void showNormalVehicleList()
    {
    	System.out.println("Details of Normal Vehicle: ");
    	
    	//count of normal vehicles
        int normalVehicleCount = normalVehicleList.size();
        System.out.println("Normal Vehicle Count: " + normalVehicleCount);
        System.out.println("");
        
        Enumeration<NormalVehicle> e = Collections.enumeration(normalVehicleList);
 
        int i = 0; //just for showing vehicle serial number.
        
        //iterating the normal vehicle list
        while(e.hasMoreElements())
        {
            i++;
            System.out.println("Normal Vehicle No. " + i);
            System.out.println("------------------------");
            
            NormalVehicle nv = e.nextElement();
            nv.printVehicle();
            
        }
        
        System.out.println("");

    
    }
    
    /**
     * Shows all sports vehicles
     */
    public void showSportsVehicleList()
    {
    	System.out.println("Details of Sports Vehicle: ");
    	
    	//count of sports vehicles
    	int sportsVehicleCount = sportsVehicleList.size();
        System.out.println("Sports Vehicle Count: " + sportsVehicleCount);
        
        System.out.println("");
        
        
        Enumeration<SportsVehicle> e = Collections.enumeration(sportsVehicleList);
 
        int i = 0; //just for showing vehicle serial number.
        
        //iterating the normal vehicle list 
        while(e.hasMoreElements())
        {
            i++;
            System.out.println("Sports Vehicle No. " + i);
            System.out.println("------------------------");
            
            SportsVehicle sv = e.nextElement();
            sv.printVehicle();
            
        }
        
        
        System.out.println("");
    }
    
    
    /**
     * Shows all heavy vehicles
     * 
     */
    public void showHeavyVehicleList()
    {
    	System.out.println("Details of Heavy Vehicle: ");
    	
    	//count of heavy vehicles
    	int heavyVehicleCount = heavyVehicleList.size();
        System.out.println("Heavy Vehicle Count: " + heavyVehicleCount);
    
        System.out.println("");
        
        
        Enumeration<HeavyVehicle> e = Collections.enumeration(heavyVehicleList);
 
        int i = 0; //just for showing vehicle serial number.
        
        //iterating the normal vehicle list
        while(e.hasMoreElements())
        {
            i++;
            System.out.println("Heavy Vehicle No. " + i);
            System.out.println("------------------------");
            
            HeavyVehicle hv = e.nextElement();
            hv.printVehicle();
            
        }
        System.out.println("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    	//creating a CarShowroom object
        CarShowroom carshowroom = new CarShowroom(30, 20); //initial expected visitor count is 30 and increase by sports car is 20
        
        //prompts welcome msg to the user
        System.out.println("Welcome to the Vehicle Showroom!");
        
        while(true)
        {
        	//prompts to take user command
            System.out.println("Please enter 1 to add any vehicle, 2 to remove any vehicle, 3 to see the vehicle lists, and 4 to see the expected visitor count");
            
            //take user command
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            
            if (option == 1)
            {
                //Add
            	
            	//take input of vehicle choice
                System.out.println("Please enter 'N' to add Normal Vehicle, 'S' to add Sports Vehicle, and 'H' to add Heavy Vehicle");
                sc = new Scanner(System.in);
                String add_option = sc.nextLine();
                
                if(add_option.equals("N"))
                {
                	//Take details of the vehicle
                    sc = new Scanner(System.in);
                    System.out.println("Enter Model Number: ");
                    String modelNumber = sc.nextLine();
                    
                    
                    sc = new Scanner(System.in);
                    System.out.println("Enter Engine Type: ");
                    String engineType = sc.nextLine();
                    
                    sc = new Scanner(System.in);
                    System.out.println("Enter Engine Power: ");
                    double enginePower = sc.nextDouble();
                    
                    sc = new Scanner(System.in);
                    System.out.println("Enter Tire Size: ");
                    double tireSize = sc.nextDouble();
                    
                    NormalVehicle nv = new NormalVehicle(modelNumber, engineType, enginePower, tireSize);
                    
                    //Add to the showroom
                    carshowroom.addNormalVehicle(nv);
                    
                
                }
                else if(add_option.equals("S"))
                {
                    
                	//Take details of the vehicle
                    sc = new Scanner(System.in);
                    System.out.println("Enter Model Number: ");
                    String modelNumber = sc.nextLine();
                    
                    sc = new Scanner(System.in);
                    System.out.println("Enter Engine Power: ");
                    double enginePower = sc.nextDouble();
                    
                    sc = new Scanner(System.in);
                    System.out.println("Enter Tire Size: ");
                    double tireSize = sc.nextDouble();
                    
                    sc = new Scanner(System.in);
                    System.out.println("Enter Turbo Type: ");
                    String turbo = sc.nextLine();
                    
                    
                    
                    SportsVehicle sv = new SportsVehicle(modelNumber, enginePower, tireSize, turbo);
                    
                   //Add to the showroom
                    carshowroom.addSportsVehicle(sv);
                    
                
                }
                else if(add_option.equals("H"))
                {
                	//Take details of the vehicle
                	
                    sc = new Scanner(System.in);
                    System.out.println("Enter Model Number: ");
                    String modelNumber = sc.nextLine();
                    
                    sc = new Scanner(System.in);
                    System.out.println("Enter Engine Power: ");
                    double enginePower = sc.nextDouble();
                    
                    sc = new Scanner(System.in);
                    System.out.println("Enter Tire Size: ");
                    double tireSize = sc.nextDouble();
                    
                    sc = new Scanner(System.in);
                    System.out.println("Enter Weight: ");
                    int weight = sc.nextInt();
                    
                    
                    
                    HeavyVehicle hv = new HeavyVehicle(modelNumber, enginePower, tireSize, weight);
                    
                    //Add to the showroom
                    carshowroom.addHeavyVehicle(hv);
                    
                
                }
                else
                {
                    
                    System.out.println("Wrong option selected. Please choose a correct one.");
                    
                
                }
                
            
            }
            else if (option == 2)
            {
                //Remove
            	
            	
            	//take input of vehicle choice
                System.out.println("Please enter 'N' to remove Normal Vehicle, 'S' to remove Sports Vehicle, and 'H' to remove Heavy Vehicle");
                sc = new Scanner(System.in);
                String remove_option = sc.nextLine();
                
                if(remove_option.equals("N"))
                {   
                	//input model number to remove
                	sc = new Scanner(System.in);
                    System.out.println("Enter Model Number to Delete: ");
                    String modelNumber = sc.nextLine();
                    
                    //remove vehicle
                    carshowroom.removeNormalVehicleByModel(modelNumber);
                    
                
                }
                else if(remove_option.equals("S"))
                {
                	//input model number to remove
                    sc = new Scanner(System.in);
                    System.out.println("Enter Model Number to Delete: ");
                    String modelNumber = sc.nextLine();
                    
                    //remove vehicle
                    carshowroom.removeSportsVehicleByModel(modelNumber);
                    
                
                }
                else if(remove_option.equals("H"))
                {
                	//input model number to remove
                    sc = new Scanner(System.in);
                    System.out.println("Enter Model Number to Delete: ");
                    String modelNumber = sc.nextLine();
                    
                    //remove vehicle
                    carshowroom.removeHeavyVehicleByModel(modelNumber);
                    
                
                }
                else
                {
                    
                    System.out.println("Wrong option selected. Please choose a correct one.");
                    
                
                }
                
            
            }
            else if (option == 3)
            {
                //show list
                carshowroom.showAllVehicleList();
            
            }
            else if (option == 4)
            {
                //show visitor count
                System.out.println("The expected visitor count at this moment is: "+carshowroom.expectedVistorCount);
            
            }
            else
            {
                System.out.println("Wrong option selected. Please choose a correct one.");
            
            }
        
        
        }
        
        
    }
    
}
