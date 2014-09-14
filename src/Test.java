import DuckExample.DonDuck;
import DuckExample.Duck;

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

		Duck reuseCodeDuck = new DonDuck();
		reuseCodeDuck.fly();
		reuseCodeDuck.quack();
		
		
		
	}

}
