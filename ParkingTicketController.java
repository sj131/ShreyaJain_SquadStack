public class ParkingTicketController {
	
	public int parkingLotController(String str) {
		
    // initialising stringChecker object to find keywords from statements in input.txt. 
		StringChecker stringChecker = new StringChecker();
		ParkingTicketServiceImpl parkingTicketServiceImpl = new ParkingTicketServiceImpl();
		
    // Creating a parking lot
		if(stringChecker.checkForKeywords(str)[0] == "Create") {
			int capacity = Integer.parseInt(stringChecker.checkForKeywords(str)[1]);
			parkingTicketServiceImpl.createParkingSlotsService(capacity);
		}
		
    // Parking a car
		else if(stringChecker.checkForKeywords(str)[0] == "Park") {
			String vehicleNumber = stringChecker.checkForKeywords(str)[1];
			int age = Integer.parseInt(stringChecker.checkForKeywords(str)[2]);
			parkingTicketServiceImpl.issueTicketService(vehicleNumber, age);
		}
		
    // deleting the ticket when car leaves.
		else if(stringChecker.checkForKeywords(str)[0] == "Leave") {
			int slotToDelete = Integer.parseInt(stringChecker.checkForKeywords(str)[1]);
			parkingTicketServiceImpl.deleteTicketService(slotToDelete);
			
		}
		
    // finding slot based on age of driver. 
		else if(stringChecker.checkForKeywords(str)[0] == "Slot Number DA") {
			int ageForSlots = Integer.parseInt(stringChecker.checkForKeywords(str)[1]);
			parkingTicketServiceImpl.findSlotsFromAgeService(ageForSlots);
		}
		
    // finding slot based on car registration number. 
		else if(stringChecker.checkForKeywords(str)[0] == "Slot Number CN") {
			String vehicleNumber = stringChecker.checkForKeywords(str)[1];
			parkingTicketServiceImpl.findSlotFromVehicleNumberService(vehicleNumber);
		}
		
    // finding vehicle number based on age.
		else if(stringChecker.checkForKeywords(str)[0] == "Age for vehicle") {
			int age = Integer.parseInt(stringChecker.checkForKeywords(str)[1]);
			parkingTicketServiceImpl.findVehicleNumbersFromAgeService(age);
		}
		return 0;
		
	}

}
