package DuckExample;

public class DonDuck extends Duck {

	public DonDuck() {
		qb = new QuackBehavior_Mute();
		fb = new FlyBehavior_WithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a don duck");
	}

}
