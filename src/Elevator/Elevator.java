package Elevator;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator implements ElevatorFactory {

	private Integer currentFloor;
	private Queue<Integer> destinationFloors;

	public Elevator(){
		this(1);
	}
	
	public Elevator(Integer currentFloor) {
		this.currentFloor = currentFloor;
		this.destinationFloors = new LinkedList<Integer>();
	}

	public int nextDestionation() {
		if(!destinationFloors.isEmpty())
			return this.destinationFloors.peek();
		else
			return -1;
	}

	public int currentFloor() {
		return this.currentFloor;
	}

	public void popDestination() {
		// remove the head, poll(), FIFO
		this.destinationFloors.remove();
	}

	@Override
	public void addNewDestinatoin(Integer destination) {
		this.destinationFloors.add(destination);
	}

	@Override
	public void moveUp() {
		currentFloor++;
	}

	@Override
	public void moveDown() {
		currentFloor--;
	}

	@Override
	public ElevatorDirection direction() {
		if (destinationFloors.size() > 0) {
			if (currentFloor < destinationFloors.peek()) {
				return ElevatorDirection.ELEVATOR_UP;
			} else if (currentFloor > destinationFloors.peek()) {
				return ElevatorDirection.ELEVATOR_DOWN;
			}
		}
		return ElevatorDirection.ELEVATOR_HOLD;
	}

	@Override
	public ElevatorStatus status() {
		return (destinationFloors.size() > 0) ? ElevatorStatus.ELEVATOR_OCCUPIED
				: ElevatorStatus.ELEVATOR_EMPTY;
	}
}
