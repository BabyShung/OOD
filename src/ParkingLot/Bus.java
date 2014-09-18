package ParkingLot;

public class Bus extends Vehicle{

	public Bus(String licensePlate){
		super(licensePlate, 5, VehicleSize.Large);
	}

	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		//check the spot...
		return false;
	}
	
	
}
