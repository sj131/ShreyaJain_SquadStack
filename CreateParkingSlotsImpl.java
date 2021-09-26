public class CreateParkingSlotsImpl implements CreateParkingSlots {
	
	Slots slots = new Slots();

	@Override
	public Slots createParkingSlots(int n) {

    // setting slot capacity with given number of slots.
		slots.setTotCapacity(n);

    // setting slots in the form 1,2,....n with 1 being nearset to the entry.
		slots.setSlots();
    System.out.println("Created parking of " + n + " slots.");
		return slots;
	}

}
