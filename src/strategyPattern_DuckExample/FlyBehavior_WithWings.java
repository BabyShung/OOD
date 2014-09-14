package strategyPattern_DuckExample;

public class FlyBehavior_WithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("flying with wings");
	}
	
}
