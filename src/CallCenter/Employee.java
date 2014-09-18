package CallCenter;

public abstract class Employee {

	private Call currentCall;
	protected Rank rank;// different in subclasses

	public void receiveCall(Call call) {

	}

	public void callCompleted() {

	}

	public void escalateAndReassign() {

	}

	public boolean assignNewCall() {
		return false;
	}

	public boolean isFree() {
		return currentCall == null;
	}

	public Rank getRank() {
		return rank;
	}
}
