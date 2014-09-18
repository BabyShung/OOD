package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected List<ParkingSpot> parkingSpots;
	protected String licensePlate;
	protected int spotsNeeded;
	protected VehicleSize size;

	public Vehicle(String licensePlate, int spotsNeeded, VehicleSize size) {
		parkingSpots = new ArrayList<ParkingSpot>();
		this.licensePlate = licensePlate;
		this.spotsNeeded = spotsNeeded;
		this.size = size;
	}

	public void parkInSpot(ParkingSpot ps) {
		parkingSpots.add(ps);
	}

	public void clearSpots() {

	}

	public abstract boolean canFitInSpot(ParkingSpot spot);

	public int getSpotsNeeded() {
		return this.spotsNeeded;
	}

	public VehicleSize getSize() {
		return this.size;
	}
}
