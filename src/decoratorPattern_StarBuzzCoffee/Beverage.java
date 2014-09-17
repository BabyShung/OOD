package decoratorPattern_StarBuzzCoffee;

public abstract class Beverage {

	protected String description = "Unknow Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
	
	@Override
	public String toString(){
		return getDescription() + ": $" + cost();
	}
}
