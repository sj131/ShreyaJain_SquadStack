import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

// implements all government rules--------!!!!!
public class GovernmentRegulationImpl implements GovernmentRegulations {

	TicketHandlerImpl ticketHandlerImpl = new TicketHandlerImpl();

  // returns vehicle registration numbers for all cars which are parked by the driver of a certain age
	@Override
	public String findVehicleNumbersFromAge(int age) {
		
		int c = 0;
    
    // finding vehicle number by age by traversing through ticket map.
		for (Entry<Integer, VehicleRegistration> entry : ticketHandlerImpl.ticket.entrySet()) {
            if (entry.getValue().getAgeOfOwner() == age) {
                System.out.print(entry.getValue().getVehicleNumber() + ", "); 
                c++; // counter for vehicle numbers caught.
            }
        }
        if(c==0) // no driver of the given age found.
        	System.out.print("No vehcle with driver of age " + age + " found.");
        System.out.println();
		return null;
	}

  // finding slot number for a given vehicle number by traversing through ticket map.
	@Override
	public int findSlotFromVehicleNumber(String vehicleNumber) {

		int c = 0;
		for (Entry<Integer, VehicleRegistration> entry : ticketHandlerImpl.ticket.entrySet()) {
            if (entry.getValue().getVehicleNumber().equals(vehicleNumber)) {
                System.out.println(entry.getKey()); 
                c++; // counter for slot numbers caught.
            }
        }
		
        if(c==0) // if no vehicle of given registration is found in parking.
        	System.out.println("No vehicle with registration number " + vehicleNumber + " found in the parking.");
		return 0;
	}

  // returns slot numbers of all slots where cars of drivers of a particular age are parked
	@Override
	public int findSlotsFromAge(int age) {
    
		int c = 0; 
		List<Integer> listOfSlots = new ArrayList<>();

    // finding slot number for a given age by traversing through ticket map.
		for (Entry<Integer, VehicleRegistration> entry : ticketHandlerImpl.ticket.entrySet()) {
      
            if (entry.getValue().getAgeOfOwner() == age) {
              // add all slots to a list if drivers of given age are found in parking
            	listOfSlots.add(entry.getKey());
                c++; // counter for slot numbers caught.
            }
        }
        if(c==0) {
          // if no driver of given age is found
        	System.out.println("No car parked by driver of age " + age + ".");
        }
        else {
          // print comma seperated slot numbers
        	for (int i = 0; i<listOfSlots.size()-1;i++) {
        		System.out.print(listOfSlots.get(i) + ", ");
			}
        	System.out.println(listOfSlots.get(listOfSlots.size()-1));
		}
		return 0;
	}

}
