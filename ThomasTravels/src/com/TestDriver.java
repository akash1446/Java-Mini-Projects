package com;

import java.util.ArrayList;

public class TestDriver {
	public static void main(String[] args) {
		    ArrayList<Driver> drivers = new ArrayList<>();
	        drivers.add(new Driver("Sudhagar", "Car", 4200, 123));
	        drivers.add(new Driver("Ramesh", "Bike", 1500, 456));
	        drivers.add(new Driver("John", "Car", 6000, 789));
	        drivers.add(new Driver("Priya", "Van", 3000, 101));

	        Travel travel = new Travel();

	        System.out.println("Is Sudhagar a car driver? " + travel.isCarDriver(drivers.get(0)));
	        System.out.println(travel.retrivebyDriverId(drivers, 123));
	        System.out.println("Number of car drivers: " + travel.retriveCountOfDriver(drivers, "Car"));
	        System.out.println("Car drivers: " + travel.retriveDriver(drivers, "Car").get(0).getName());
	        Driver maxDistanceDriver=travel.retriveMaximumDistanceTravelledDriver(drivers);
	        if(maxDistanceDriver != null) {
	        System.out.println("Driver with maximum distance travelled: " +maxDistanceDriver.getCategory()+", Category: " +maxDistanceDriver.getCategory() + ", Distance: "+maxDistanceDriver.getCategory());
	        } else {
	        	System.out.println ("No Driver Found.");
	        }
		    
	}
}
