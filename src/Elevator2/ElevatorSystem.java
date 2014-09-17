package Elevator2;

import java.util.Observable;
import java.util.Observer;
import java.util.Queue;

/**
 * Use cases:
 * In each floor, user can press up/down
 * In elevator, user can select a floor
 * In elevator, user can open door
 * In elevator, user can close door
 * In elevator, user can press emergency button
 * Elevator should respond to user within some time
 * Elevator has capacity restriction
 */

import Elevator.Elevator;

public class ElevatorSystem implements Observer {

	// Singleton
	private static ElevatorSystem instance;

	// N elevators
	private Elevator[] elevatorPool;

	// M floors, N elevators, each one has a control panel.
	private FloorControl[][] floorControls;

	// FIFO
	private Queue<Request> requestQueue;

	public synchronized static ElevatorSystem getInstance() {
		if (instance == null) {
			instance = new ElevatorSystem();
		}
		return instance;
	}

	public void request(int floor, Direction direction) {
	}

	public void update(Observable elevator, Object state) {
	}

	private class Request {
		int floor;
		Direction direction;

		public Request(int floor, Direction direction) {
			this.floor = floor;
			this.direction = direction;
		}
	}
}