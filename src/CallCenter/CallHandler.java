package CallCenter;

import java.util.List;

/**
 * 
 * Singleton, it handlers and calls and enqueues calls
 * 
 * you may consider it call center
 * 
 * @author haozheng
 *
 */

public class CallHandler {
	private static CallHandler instance;

	private final int LEVELS = 3;

	private final int NUM_R = 10;
	private final int NUM_M = 4;
	private final int NUM_D = 2;

	List<List<Employee>> empLevels;

	List<List<Call>> callQueues;

	protected CallHandler() {

	}

	// singleton method
	public static CallHandler getInstance() {
		if (instance == null)
			instance = new CallHandler();
		return instance;
	}

	public Employee getHandlerForCall(Call call) {
		return null;
	}

	public void dispatchCall(Caller caller) {
		Call call = new Call(caller);
		dispatchCall(call);
	}

	public void dispatchCall(Call call) {
		Employee emp = getHandlerForCall(call);
		if (emp != null) {
			emp.receiveCall(call);
			call.setHandler(emp);
		} else {
			call.reply("Please wait for next employee..");
			callQueues.get(call.getRank().getValue()).add(call);
		}
	}
	
	public void assignCall(Employee emp){
		
	}
}
