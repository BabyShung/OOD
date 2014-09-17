package Elevator2;

import java.util.ArrayList;
import java.util.Observable;

public class Elevator extends Observable {
	private int floor;
	private Direction direction;
	private ArrayList<Integer> upStops;
	private ArrayList<Integer> downStops;
	private int capacity;

	public void setDirection(Direction direction) {
	}

	public void moveToNext() {
	}

	public State getState() {
		return null;
	}

	public Direction getDirection() {
		return null;
	}

	public void open() {
	}

	public void close() {
	}

	public void addStop(int floor) {
	}
}