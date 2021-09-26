public class ParkingTicketServiceImpl implements ParkingTicketService {
	
	StringChecker stringChecker = new StringChecker();
	CreateParkingSlotsImpl createParkingSlotsImpl = new CreateParkingSlotsImpl();
	TicketHandlerImpl ticketHandlerImpl = new TicketHandlerImpl();
	GovernmentRegulationImpl governmentRegulationImpl = new GovernmentRegulationImpl();

	@Override
	public Slots createParkingSlotsService(int n) {
		createParkingSlotsImpl.createParkingSlots(n);
		return null;
	}

	@Override
	public void issueTicketService(String vehicleNumber, int age) {

    // invoking issueTicket and adding vehicle object to ticket map
    // invoking VehicleRegistration constructor and storing received vehicle number and age to it 
		int slotNumber = ticketHandlerImpl.issueTicket(new VehicleRegistration(vehicleNumber, age));
	}

	@Override
	public VehicleRegistration deleteTicketService(int slot) {

    // invoking deleteTicket and removing (slot, vehicle object) to ticket map.
		VehicleRegistration leftVehicle = ticketHandlerImpl.deleteTicket(slot);
		return leftVehicle;
	}

	@Override
	public int findSlotsFromAgeService(int age) {
		governmentRegulationImpl.findSlotsFromAge(age);
		return 0;
	}

	@Override
	public int findSlotFromVehicleNumberService(String vehicleNumber) {
		governmentRegulationImpl.findSlotFromVehicleNumber(vehicleNumber);
		return 0;
	}

	@Override
	public String findVehicleNumbersFromAgeService(int age) {
		governmentRegulationImpl.findVehicleNumbersFromAge(age);
		return null;
	}

}
