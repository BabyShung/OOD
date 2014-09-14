package DuckExample;

public class QuackBehavior_Mute implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("can't quack");
	}

}
