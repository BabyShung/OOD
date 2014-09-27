package ParkingLot3;

import java.util.List;

import ParkingLot3.ParkingSpace.ParkingSpaceType;

public class ParkingLot {
	private List<ParkingSpace> freeRegularSpace;
	private List<ParkingSpace> freeHandicappedSpace;
	private List<ParkingSpace> freeCompactSpace;

	public ParkingLot() {

	}

	public ParkingSpace allocateFreeSpace(ParkingSpaceType pspaceType) {
		// get a ParkingSpace from the corresponding free list
		pspace.setStart();
		return pspace;
	}

	public float reclaimFreeSpace(ParkingSpace pspace) {

		pspace.setEnd();

		// return free space to the list
		return pspace.getFee(perm);
	}

	private Permission perm;

	public ParkingSpace getfreeSpace(ParkingSpaceType car) {
		// TODO Auto-generated method stub
		return null;
	}
}
