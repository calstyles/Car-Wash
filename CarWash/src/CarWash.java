/**
 * A class that will run through the simulation and print out the data
 * 
 * @author Caleb Styles
 * @version 10/27/2021
 *
 */

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import javax.swing.text.html.HTMLDocument.Iterator;

public class CarWash {
	
	private Car[] arr;
	private Car customer;
	private int bays;
	public int big = Integer.MIN_VALUE;
	double prob;
	private Queue<Car> q = new ArrayDeque<>();
	private Random rand = new Random();
	int steps = 0;
	private int totalCars = 0;
	private double totalMoney = 0.0;
	
	/**
	 * 
	 * @param bays represents the number of bays that will be used
	 */
	
	public CarWash(int bays) {
		this.bays = bays;
		this.arr = new Car[bays];
	}
	
	/**
	 * 
	 * @param steps declares the number of steps that the simulation will run
	 * @param prob indicates the probability a car will show up
	 */
	
	public void run(int steps, double prob) {
		this.steps = steps;
		this.prob = prob;
		
		for(int i = 0; i < steps; i++) {
			if (rand.nextDouble() <= prob) {
					customer = new Car(CarWashOption.getRandomOption());
					q.add(customer);
			}
			
			if(q.size() > big) {
				big = q.size();
			}
			
			for(int j = 0; j < bays; j++) {
				if(arr[j] == null && q.size() > 0) {
					arr[j] = q.remove();	
				}
				
				if(arr[j] != null) {
					arr[j].decrementTime();
					if(arr[j].getTime() <= 0) {
						totalCars++;
						totalMoney += arr[j].getVar().getPrice();
						arr[j] = null;
					}
				}
			}
		}	
	}
	
	/**
	 * Prints out the relevant simulation data
	 */
	
	public void printData() {
		
		System.out.println("A total number of " + steps + " steps have been run!");
		System.out.println("A total number of " + bays + " bays have been used!");
		System.out.println("The probability a car would arrive was a " + prob * 100 + "% chance.");
		System.out.println("The longest the queue reached was " + big + ".");
		System.out.println("The total number of cars left at the end was " + q.size() + ".");
		System.out.println("The total number of cars washed were " + totalCars + " and the total revenue was " + totalMoney + ".");
		System.out.println("\n");
	}

}
