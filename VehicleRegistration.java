public class VehicleRegistration {
  
	
	private String vehicleNumber;
	private int ageOfOwner;
  
	// creating constructor and getters and setters
	public VehicleRegistration(String vehicleNumber, int ageOfOwner) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.ageOfOwner = ageOfOwner;
	}
	
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) { 
		this.vehicleNumber = vehicleNumber;
	}
	
	
	public int getAgeOfOwner() {
		return ageOfOwner;
	}
	public void setAgeOfOwner(int ageOfOwner) {
		this.ageOfOwner = ageOfOwner;
	}
	
	

}
