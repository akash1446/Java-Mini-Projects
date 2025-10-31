package com;

import java.util.ArrayList;

public class Travel {
	   Driver[] driver;
	 
	 public boolean isCarDriver(Driver driver) {
		 
	        return driver.getCategory().equalsIgnoreCase("Car");
		 
			}

	    public String retrivebyDriverId(ArrayList<Driver> drivers, int driverId) {
	        for (Driver driver : drivers) {
	            if ( driver.getDriverID() == driverId) {
	                return "Driver name is " + driver.getName() + " Belonging to the category " + driver.getCategory()
	                        + " traveled " + driver.getTotalDistance() + " KM so far";
	            }
	        }
	        return "Driver not found";
	    }

	    public int retriveCountOfDriver(ArrayList<Driver> drivers, String category) {
	        int count = 0;
	        for (Driver driver : drivers) {
	            if (driver.getCategory().equalsIgnoreCase(category)) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public ArrayList<Driver> retriveDriver(ArrayList<Driver> drivers, String category) {
	        ArrayList<Driver> result = new ArrayList<>();
	        for (Driver driver : drivers) {
	            if (driver.getCategory().equalsIgnoreCase(category)) {
	                result.add(driver);
	            }
	        }
	        return result;
	    }

	    public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers) {
	    	if(drivers.isEmpty()) {
	    		return null;
	    	}

	        Driver maxDriver = drivers.get(0);
	        for (Driver driver : drivers) {
	            if (driver.getTotalDistance() > maxDriver.getTotalDistance()) {
	                maxDriver = driver;
	            }
	        }
	        return maxDriver;
	    }

	

		
		}
	    
	
