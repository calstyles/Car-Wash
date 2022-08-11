/**
 * A class that generates a random car wash option and returns the time and type of option 
 * 
 * @author Caleb Styles
 * @version 10/27/2021
 *
 */

public class Car {
	
	private CarWashOption var = CarWashOption.getRandomOption();
	private int time;
	
	/**
	 * 
	 * @param var the random car wash option type
	 */
	
	public Car(CarWashOption var) {
		this.var = var;
		time = var.time;
	}
	
	/**
	 * 
	 * @return the random type of car wash option
	 */
	
	public CarWashOption getVar() {
		return var;
	}
	
	/**
	 * 
	 * @return an integer representing the time remaining for the car's wash to finish
	 */
	
	public int getTime() {
		return time;
	}
	
	/**
	 * Decrements the time remaining in the simulation
	 */
	
	public void decrementTime() {
			time--;
	}
}