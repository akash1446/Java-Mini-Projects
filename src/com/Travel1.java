package com;

import java.util.ArrayList;

public class Travel1 {
	 public boolean isCarDriver(Driver1 driver) {
		 return driver.getCategory().equalsIgnoreCase("Car");
		 }
     public String retrivebyDriverId(ArrayList<Driver1> driverList, int driverId) {
	         for (Driver1 driver : driverList) {
	            if ( driver.getDriverId() == driverId) {
	                return "Driver name is " + driver.getDriverName() + " Belonging to the category " + driver.getCategory()
	                        + " traveled " + driver.getTotalDistance() + " KM so far";
	            }
	        }
	        return "Driver not found";
	    }

	    public int retriveCountOfDriver(ArrayList<Driver1> driverList, String category) {
	        int count = 0;
	        for (Driver1 driver : driverList) {
	            if (driver.getCategory().equalsIgnoreCase(category)) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public ArrayList<Driver1> retriveDriver(ArrayList<Driver1> driverList, String category) {
	        ArrayList<Driver1> result = new ArrayList<>();
	        for (Driver1 driver : driverList) {
	            if (driver.getCategory().equalsIgnoreCase(category)) {
	                result.add(driver);
	            }
	        }
	        return result;
	    }

	    public Driver1 retriveMaximumDistanceTravelledDriver(ArrayList<Driver1> drivers) {
	    	if(drivers.isEmpty()) {
	    		return null;
	    	}

	        Driver1 maxDriver = drivers.get(0);
	        for (Driver1 driver : drivers) {
	            if (driver.getTotalDistance() > maxDriver.getTotalDistance()) {
	                maxDriver = driver;
	            }
	        }
	        return maxDriver;
	    }

	

		
		}
	    
		   