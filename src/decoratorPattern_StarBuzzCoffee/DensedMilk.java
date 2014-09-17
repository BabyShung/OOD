package decoratorPattern_StarBuzzCoffee;

public class DensedMilk extends CondimentDecorator {

	Beverage beverage; // Association to the Beverage class, remember!

	public DensedMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", DensedMilk";
	}

	@Override
	public double cost() {
		return beverage.cost() + .05;
	}

}
