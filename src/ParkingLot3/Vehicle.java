package ParkingLot3;

public abstract class Vehicle {

	protected ParkingSpace pspace;

	public abstract boolean park(ParkingLot pLot);

	public boolean unpark(ParkingLot pLot) {
		if (pspace != null) {
			pLot.reclaimFreeSpace(pspace);
			return true;
		}
		return false;
	};

}