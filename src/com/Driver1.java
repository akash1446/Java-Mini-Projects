package com;

public class Driver1 {
	private String Category;
	private  int 	driverId;
	private String driverName;
	private int  TotalDistance;

public Driver1() {
	 
 }
	public  Driver1(String Category,int driverId,String driverName,int TotalDistance) {
	   this.Category = Category;
	   this.driverId  = driverId;
       this.driverName = driverName;
       this.TotalDistance = TotalDistance;

	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public int getTotalDistance() {
		return TotalDistance;
	}
	public void setTotalDistance(int TotalDistance) {
		this.TotalDistance = TotalDistance;
	}
	@Override
	public String toString() {
		return "Driver [Category=" + Category + ", driverId=" + driverId + ", driverName=" + driverName + ", TotalDistance="
				+ TotalDistance + "]";
	} 
	
}

