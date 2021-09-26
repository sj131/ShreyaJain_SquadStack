import java.util.HashMap;
import java.util.Map;

public class TicketHandlerImpl implements TicketHandler {
	
	public static Map<Integer, VehicleRegistration> ticket = new HashMap<Integer, VehicleRegistration>();
	public static Slots slots = new Slots(); 
	
  // Issues new ticket for the next vehicle.
	public int issueTicket(VehicleRegistration vehicleRegistration) {
    
    // sorting slots for nearset availability.
		slots.sortSlots(slots.getSlots()); 
		int slotNumber = 0;
		
		if(!slots.getSlots().isEmpty()) {

      // alloting nearest parking slot (at index 0).
			slotNumber = slots.getSlots().get(0); 
			
      // mapping slot with vehicleRegistration object.
			ticket.put(slots.getSlots().get(0), vehicleRegistration); 
			
      // Marking slot as unavailable, hence removing it from list of available slots. 
      slots.removeSlot(slots.getSlots(), 0);
			
			System.out.println("Car with vehicle registration number " + vehicleRegistration.getVehicleNumber() + " has been parked at slot number " + slotNumber + ".");
			return slotNumber;
		}
		else {
			// if the parking space is full, no more cars can be parked
			System.out.println("Capacity Full: Ticket not generated");
			return -1;
		}
		}
	
	public VehicleRegistration deleteTicket(int slot) {
		
		if(!slots.getSlots().contains(slot) && slots.getTotCapacity() != 0) {
			
      VehicleRegistration v1 = ticket.get(slot);
			
      // deleting the mapping created when a car leaves the slot.
			ticket.remove(slot); 

      // add the slot back to the available slot list.
			slots.addSlot(slots.getSlots(), slot);

			System.out.println("Slot number " + slot + " vacated, the car with vehicle registration number " + v1.getVehicleNumber() + " left the space, the driver of the car was of age " + v1.getAgeOfOwner() + ".");
			
			return v1;
		}
		else {
			// check if the slot is already vacant.
			System.out.println("Slot already vacant");	
			return null;
		}
		
	}
}
