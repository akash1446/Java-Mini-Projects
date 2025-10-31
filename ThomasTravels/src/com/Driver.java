package com;

public class Driver {
	
	
	private String Category;
	private  int 	driverId;
	private String name;
	private int DistanceTravelled;

	
	public Driver(String string, String string2, int i, int j) {
		// TODO Auto-generated constructor stub
	}
	public void Driver() {
	 
 }
     public void Driver(String name,String Category,int driverId,int DistanceTravelled) {
	            this.driverId  = driverId;
	           this.name = name;
	           this.Category = Category;
	           this.DistanceTravelled = DistanceTravelled;
	 
     }
	 public String getCategory() {
		return Category;
	}
	 public void setCategory(String Category) {
		 this.Category=Category;
	 }
	 public int getTotalDistance() {
		 return DistanceTravelled;
	 }
	 public void setTotalDistance(int DistanceTravelled) {
		 this.DistanceTravelled = DistanceTravelled;
	 }
	 public String getName() {
		return name;
	}
	 public void setName(String driverName) {
		 this.name = driverName;
	 }
	 public int getDriverID() {
		 return driverId;
	 }
	 public void setDriverID(int driverId) {
		 this.driverId= driverId;
	 }
	 @Override
	public String toString() {
		return "Driver [driverID=" + 	driverId + ", driverName=" + name + ", Category=" + Category
				+ ", totalDistance=" + DistanceTravelled + ", category=" + Category + "]";
	 }


	
}
