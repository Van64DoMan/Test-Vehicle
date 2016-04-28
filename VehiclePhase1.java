/*
Creator:
        Van Do
Creation Date:
        31/03/2016
Methods:
        + void main(String[] args)
Classes this class require
        Vehicle
Classes that require this class
        Journey and FuelPurchase
TO DO:
        Record vehicle's details, journey details and fuel purchase details (completed 28/04/2016)
*/
package vehiclephase1;
import java.util.*;

public class VehiclePhase1 
{
    public static void main(String[] args) 
    {	
        //Arraylist of vehicles
        ArrayList<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle("Audi", "A6", 2003));
        list.add(new Vehicle("Jaguar", "X200", 2003));
        list.add(new Vehicle("Mercedes", "CL600-C200", 2003));
        
        for(Vehicle auto : list) //For each vehicle in arraylist
        {
            auto.print(); //Print inital vehicle's details
        }

        System.out.println("==================================");
        
        for(Vehicle auto : list)
        {
            for (int count = 0; count < 10; count++) //Continue this loop 10 times 
            {
                auto.addKilometers(new Random().nextInt(50)); //Random kilometres from 0 to 50 inclusively
                auto.addLitres(new Random().nextInt(50)); //Random litres from 0 to 50 inclusively
                auto.addCost(new Random().nextInt(50)); //Random cost from 0 to 50 inclusively
            }
            
            auto.print(); //Print new details
        }
    }
    
}
