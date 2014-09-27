package ParkingLot3;

import ParkingLot3.ParkingSpace.ParkingSpaceType;

public class HandicappedCars extends Vehicle {
	@Override
	public boolean park(ParkingLot pLot) {
		if ((pspace = pLot.allocateFreeSpace(ParkingSpaceType.HANDICAPPED)) == null
				&& (pspace = pLot.getfreeSpace(ParkingSpaceType.CAR)) == null) {
			return false;
		}
		return true;
	}
}