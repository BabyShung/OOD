package factoryPattern_PizzaStore;

import java.util.ArrayList;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<>();

	public void prepare() {
		System.out.println("preparing..");
	}

	public void bake() {
		System.out.println("baking..");
	}

	public void cut() {
		System.out.println("cutting..");
	}

	public void box() {
		System.out.println("boxing..");
	}

	public String getName() {
		return name;
	}
}
