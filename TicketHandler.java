public interface TicketHandler {
	
	public int issueTicket(VehicleRegistration vehicleRegistration);
	public VehicleRegistration deleteTicket(int slot);
}
