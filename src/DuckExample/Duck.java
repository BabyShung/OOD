package DuckExample;

public abstract class Duck {

	protected FlyBehavior fb;
	protected QuackBehavior qb;

	public Duck() {

	}

	public abstract void display();

	public void fly() {
		fb.fly();
	}

	public void quack() {
		qb.quack();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
