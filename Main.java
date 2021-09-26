import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws IOException {

    // getting input file.
    File file = new File("input.txt"); 
    
    Scanner scanner = new Scanner(file);
    // initialising controller object.
		ParkingTicketController parkingTicketController = new ParkingTicketController();

    while(scanner.hasNextLine()) {
			
      // sending string from input.txt to controller function.
			String str = scanner.nextLine();
			parkingTicketController.parkingLotController(str);

  }
}
}