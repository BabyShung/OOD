package Elevator;

public interface ElevatorControllerFactory {

	public void pickUp(Integer pickUpFloor);

	public void destination(Integer elevatorId, Integer destinationFloor);

	public void step();

}
