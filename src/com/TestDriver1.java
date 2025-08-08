package com;

import java.util.ArrayList;

public class TestDriver1 {
	public static void main(String[] args) {
	
	ArrayList<Driver1> drivers = new ArrayList<Driver1>();
    drivers.add(new Driver1("Car",1,"Sudhagar",4200));
    drivers.add(new Driver1("Auto",2,"Ganga",3000));
    drivers.add(new Driver1("Lorry",3,"Shiva",2000));
    drivers.add(new Driver1("Car",4,"Sudhagar",5000));
    System.out.println(drivers);
    
    Travel1 travel = new Travel1();

    System.out.println("Is Sudhagar a car driver? " + travel.isCarDriver(drivers.get(0)));
    System.out.println(travel.retrivebyDriverId(drivers, 123));
    System.out.println("Number of car drivers: " + travel.retriveCountOfDriver(drivers, "Car"));
    System.out.println("Car drivers: " + travel.retriveDriver(drivers, "Car").get(0).getDriverName());
    Driver1 maxDistanceDriver=travel.retriveMaximumDistanceTravelledDriver(drivers);
    System.out.println("Driver with maximum distance travelled: " + maxDistanceDriver.getDriverName() + 
    	   ",Category: " +maxDistanceDriver.getCategory() + 
    	   ",Distance: "+maxDistanceDriver.getTotalDistance());
   
	}
}
