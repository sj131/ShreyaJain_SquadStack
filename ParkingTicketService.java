public interface ParkingTicketService {
	
	public Slots createParkingSlotsService(int n);
	public void issueTicketService(String vehicleNumber, int age);
	public VehicleRegistration deleteTicketService(int slot);
	public int findSlotsFromAgeService(int age);
	public int findSlotFromVehicleNumberService(String vehicleNumber);
	public String findVehicleNumbersFromAgeService(int age);
	
}
