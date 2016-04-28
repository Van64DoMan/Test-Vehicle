package vehiclephase1;

import java.text.DecimalFormat;
import java.util.*;

public class Vehicle 
{
    DecimalFormat decimal = new DecimalFormat("#,###"); 
    //Any variables with 'decimal' as format will have whole number
    String manufacturer; //Company/manufacturer
    String model; //Model type
    int makeYear; //Year made
    Journey travel; //Journey class
    FuelPurchase fuel; //FuelPurchase class

    ArrayList<Journey> journeyList = new ArrayList<>(); //ArrayList of Journey
    ArrayList<FuelPurchase> fuelList = new ArrayList<>(); //ArrayList of FuelPurchase

    public Vehicle() //Create Vehicle class constructor and set default values
    {
        this.manufacturer = "Audi";
        this.model = "A6";
        this.makeYear = 2003;
        travel = new Journey();
	fuel = new FuelPurchase();
    }

    //Create copy Vehicle class constructor except add any manufacturer, model and year 
    public Vehicle(String manufacturer, String model, int makeYear)
    {
        this.manufacturer = manufacturer;
        this.model = model;
        this.makeYear = makeYear;
        travel = new Journey();
        fuel = new FuelPurchase();
    }
    
    //Getter
    public int Year()
    {
        return makeYear; //Get makeYear
    }
    
    //Setters
    void setYear(int yearly)
    {
        //makeYear cannot be less than 1900 or greater than 2016
        if(yearly < 1900 || yearly > 2016)
        {
            System.out.println("Not valid year");
            System.exit(makeYear); //Stop program if condition met
        }
        
        else
        {
            this.makeYear = yearly; //makeYear becomes yearly e.g 2013 
        }

    }
    
    //Print and get from Journey class, act like array
    public void printJourney(Journey journey)
    {
        travel.litres = fuel.Litre();
        travel.setService();
        System.out.println("Total Kilometres Travelled: " + decimal.format(travel.getKilometers()));
        //travel.getKilometers() becomes whole number
        travel.getTotalServices();
        travel.setFuelEconomy();
        travel.getFuelEconomy();
        addJourney(travel); //Add journey to vehicle's journeyList (array)
    }
    
    //Print and get from FuelPurchase class, act like array
    public void printFuelPurchase(FuelPurchase fuelPurchase)
    {
        
        fuel.setAverage();
        System.out.println("Total fuel capacity: " + decimal.format(fuel.Litre()) +"L");
        //fuel.Litre() becomes whole number
	System.out.println("Total fuel cost: $" + decimal.format(fuel.Cost()));
        //fuel.Cost() becomes whole number
        fuel.getAverage();
        addFuel(fuel);
    }

    //Print values from instance variables
    void printDetails()
    {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Make Year: " + makeYear);
    }
    
    //Print from methods in this class
    void print()
    {
        printDetails();
        printJourney(travel);
        printFuelPurchase(fuel);
        System.out.println();
    }
    
    //Keep adding up distance from VehiclePhase1 class and store distance
    public void addKilometers(double distance) 
    {
	travel.addKilometers(distance);
        journeyList.add(travel);
    }
    
    //Keep adding up litres from VehiclePhase1 class and store litres
    public void addLitres(double petrol) 
    {
	fuel.addLitres(petrol);
    }
    
    //Keep adding up cost from VehiclePhase1 class and store cost
    public void addCost(double money) 
    {
	fuel.addCost(money);
    }

    //Add journey class to journeyList (arrayList)
    void addJourney(Journey journey1)
    {
        journeyList.add(journey1);
    }
    
    //Add fuelpurchase class to fuelList (arrayList)
    void addFuel(FuelPurchase fuel)
    {
        fuelList.add(fuel);
    }

}

