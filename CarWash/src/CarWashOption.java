/**
 * A class that determines the price and time of the different car wash types
 * 
 * @author Caleb Styles
 * @version 10/27/2021
 *
 */

import java.util.Random;

public enum CarWashOption {
	
	BASIC(5, 10),
	STANDARD(7, 17.5),
	WASH_N_WAX(10, 27.5),
	DELUXE_WASH(12, 35),
	DELUXE_WAX_N_WASH(20, 50);
	
	private static CarWashOption[] vals = values();
	private static Random rand = new Random();
	
	public int time;
	public double price;

	/**
	 * 
	 * @param time an integer that represents how long the cycle will last
	 * @param price a double that represents the cost of the wash
	 */
	
	private CarWashOption(int time, double price) {
		this.time=time;
		this.price=price;
	}
	
	/**
	 * 
	 * @return the amount of time that the cycle lasted
	 */
	
	public int getTime() {
		return time;
	}
	
	/**
	 * 
	 * @return the amount paid for the car
	 */
	
	public double getPrice() {
		return price;
	}
	
	/**
	 * 
	 * @return a random type of car wash
	 */
	
	public static CarWashOption getRandomOption() {
		return vals[(rand.nextInt(vals.length))];
	}
}
