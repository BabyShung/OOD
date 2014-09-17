import observerPattern_WeatherStation.CurrentConditionDisplay;
import observerPattern_WeatherStation.WeatherData;
import strategyPattern_DuckExample.DonDuck;
import strategyPattern_DuckExample.Duck;
import decoratorPattern_StarBuzzCoffee.Beverage;
import decoratorPattern_StarBuzzCoffee.DarkRoast;
import decoratorPattern_StarBuzzCoffee.DensedMilk;
import decoratorPattern_StarBuzzCoffee.Espresso;
import decoratorPattern_StarBuzzCoffee.HouseBlend;
import decoratorPattern_StarBuzzCoffee.Mocha;
import decoratorPattern_StarBuzzCoffee.Whip;

public class Test {

	public static void main(String[] args) {

		/**
		 * 1.Abstract class: Duck
		 * 
		 * 2.Subclass: DonDuck, has instance var.s which are interface reference
		 * var.s
		 * 
		 * 3.Interfaces: Quack (quack() method), Fly (fly() method)
		 * 
		 * 4.Concrete behavior classes: QuackBehavior_Mute,
		 * FlyBehavior_WithWings, etc
		 * 
		 * 
		 */

		// Strategy Pattern, can dynamically change the behaviors
		/**
		 * The Strategy Pattern defines a family of algorithms, encapsulates
		 * each one, and makes them interchangeable. Strategy lets the algorithm
		 * vary independently from clients that use it.
		 */
		Duck reuseCodeDuck = new DonDuck();
		reuseCodeDuck.fly();
		reuseCodeDuck.quack();

		/**
		 * Observer pattern
		 */
		WeatherData wd = new WeatherData();
		CurrentConditionDisplay ccd = new CurrentConditionDisplay(wd);
		wd.setMeasure(70, 56, 30.2f);

		/**
		 * Decorator Pattern
		 */
		Beverage beverage = new Espresso();
		System.out.println(beverage);

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new DensedMilk(beverage2);
		System.out.println(beverage2);

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Whip(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new DensedMilk(beverage3);
		System.out.println(beverage3);

	}

}
