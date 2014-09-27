package ParkingLot3;

import ParkingLot3.ParkingSpace.ParkingSpaceType;

public class Cars extends Vehicle {

	@Override
	public boolean park(ParkingLot pLot) {
		if ((pspace = pLot.allocateFreeSpace(ParkingSpaceType.CAR)) == null) {
			return false;
		}
		return true;
	}
	

}