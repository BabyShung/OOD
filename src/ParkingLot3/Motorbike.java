package ParkingLot3;

import ParkingLot3.ParkingSpace.ParkingSpaceType;

public class Motorbike extends Vehicle {
	@Override
	public boolean park(ParkingLot pLot) {
		if ((pspace = pLot.allocateFreeSpace(ParkingSpaceType.MOTORBIKE)) == null) {
			return false;
		}
		return true;
	}
}
