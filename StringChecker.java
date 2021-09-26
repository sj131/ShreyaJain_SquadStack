public class StringChecker {
	// checks the input string for different actions.

	public static String[] toReturn = new String[3];
	public String[] checkForKeywords(String str) {
		
		String[] strings = str.split(" "); 

    // Checking for keyword 'Create_parking_lot' 
		if(strings[0].startsWith("Create")) { 
			toReturn[0] = "Create";
			toReturn[1] = strings[1];	
		}
		
    // Checking for keyword 'Park'
		if(strings[0].startsWith("Park")) {
			toReturn[0] = "Park";
			toReturn[1] = strings[1];
			toReturn[2] = strings[3];
		}
		
    // Checking for keyword 'Slot_numbers_for_driver_of_age'
		if(strings[0].startsWith("Slot_numbers_for_driver_of_age")) {
			toReturn[0] = "Slot Number DA";
			toReturn[1] = strings[1];
		}
		
    // Checking for keyword 'Slot_number_for_car_with_number'
		if(strings[0].startsWith("Slot_number_for_car_with_number")) {
			toReturn[0] = "Slot Number CN";
			toReturn[1] = strings[1];
		}

    // Checking for keyword 'Leave'
		if(strings[0].startsWith("Leave")) {
			toReturn[0] = "Leave";
			toReturn[1] = strings[1];
		}
		
    // Checking for keyword 'Vehicle_registration_number_for_driver_of_age'
		if(strings[0].startsWith("Vehicle")) {
			toReturn[0] = "Age for vehicle";
			toReturn[1] = strings[1];
		}
		
		return toReturn;
	}

}
