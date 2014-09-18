package ParkingLot;

public class ParkingSpot {

	private Vehicle vehicle;
	private VehicleSize spotSize;
	private int row;
	private int spotNumber;
	private Level level;

	public ParkingSpot() {
		// .....
	}

	public boolean isAvailable() {
		return vehicle == null;
	}

	public boolean canFitVehicle(Vehicle vehicle) {
		return false;
	}

	public int getRow() {
		return row;
	}

	public int getSpotNumber() {
		return spotNumber;
	}

	public void removeVehicle() {

	}

}
