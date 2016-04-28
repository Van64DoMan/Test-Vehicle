/*
Creator:
        Van Do
Creation Date:
        10/04/2016
Methods:
        + void main(String[] args)
Classes this class require
        Vehicle
Classes that require this class
        Journey, FuelPurchase, PerKmRental, PerDayRental and Service
TO DO:
        Verify vehicle's service details (completed 28/04/2016)
*/
package vehiclephase2;

import java.util.*;

public class VehiclePhase2
{
    //Arraylist of vehicles
    public static void main(String[] args) 
    {	
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
            System.out.println("Error: Vehicle must be serviced first."); //Show details that did not service first time
            System.out.println();
        }
    }
}
