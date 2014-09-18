package ParkingLot;

public class Level {

	private int floor;
	private ParkingSpot[] spots;
	private int availableSpots = 0;
	private static final int SPOTS_PER_ROW = 10;

	public Level(int floor, int numberSpots) {
		// ...
	}

	public int getAvailableSpots() {
		return availableSpots;
	}

	public boolean parkVehicle(Vehicle vehicle) {
		return false;
	}

	public boolean parkStartingAtSpots(int spotNum, Vehicle vehicle) {
		return false;
	}

	private int findAvailableSpots(Vehicle vehicle) {
		return 0;
	}

	public void spotFreed() {
		availableSpots++;
	}
}
