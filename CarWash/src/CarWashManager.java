/**
 * Creates car objects and runs the simulations
 * 
 * @author Caleb Styles
 * @version 10/27/2021
 * 
 */

public class CarWashManager {

	public static void main(String []args) {
	
		System.out.println("Car Wash 1: ");
		CarWash c1 = new CarWash(2);
		c1.run(20, 0.5);
		c1.printData();
		
		System.out.println("Car Wash 2: ");
		CarWash c2 = new CarWash(2);
		c2.run(20, 0.5);
		c2.printData();
		
		System.out.println("Car Wash 3: ");
		CarWash c3 = new CarWash(50);
		c3.run(10000, 0.98);
		c3.printData();
	}
}
