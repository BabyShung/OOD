package ParkingLot;

public class Motorcycle extends Vehicle{

	public Motorcycle(String licensePlate){
		super(licensePlate, 1, VehicleSize.Motorcycle);
	}

	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		//check the spot...
		return false;
	}
}