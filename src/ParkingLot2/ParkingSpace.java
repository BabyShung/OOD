package ParkingLot2;

public class ParkingSpace {
	private ParkingType type;

	private long enterTime;

	private int level;
	private int location;
	private int distance;

	public void enter() {
	}

	public void leave() {
	}

	public boolean isOccupied() {
		return false;
	}

	// optional
	public void reserve() {
	};
}