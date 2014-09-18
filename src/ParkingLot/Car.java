package ParkingLot;

public class Car extends Vehicle{

	public Car(String licensePlate){
		super(licensePlate, 1, VehicleSize.Compact);
	}

	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		//check the spot...
		return false;
	}
}
