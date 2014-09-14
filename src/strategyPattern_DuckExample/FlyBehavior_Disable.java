package strategyPattern_DuckExample;

public class FlyBehavior_Disable implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("can't fly");
	}

}
