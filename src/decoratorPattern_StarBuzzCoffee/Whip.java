package decoratorPattern_StarBuzzCoffee;

public class Whip extends CondimentDecorator {

	Beverage beverage; // Association to the Beverage class, remember!

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + .12;
	}

}
