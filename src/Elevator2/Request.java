package Elevator2;

public class Request {
	int floor;
	Direction direction;

	// a specific floor request elevator: which floor, which direction
	public Request(int floor, Direction direction) {
		this.floor = floor;
		this.direction = direction;
	}
}