package ParkingLot2;

/**
 * <Problem>
Design an OO parking lot. What classes and functions will it have. 
It should say, full, empty and also be able to find spot for Valet parking. 
The lot has 3 different types of parking: regular, handicapped and compact.

Use cases:
- ask whether parking lot is full for a type
- find the nearest parking lot for a type
- enter parking lot and get a ticket
- park at a parking space
- leave from a parking space
- leave parking lot and pay the ticket
- reserve a parking space
- cancel a reservation
 * 
 * @author haozheng
 *
 */
public class ParkingLot {

	private ParkingSpace[] parkingSpaces;

	public boolean isFull(ParkingType type) {
		return false;
	}

	public ParkingSpace findNearestParkingLot(ParkingType type) {
		return null;
	}
}