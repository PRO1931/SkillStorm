package com.skillstorm.week6.day4.assignment;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class DeliveryRestaurant {

	private String name;
	private double amountEarned;
	private Order order;
	private Queue<Order> deliveryLine = new PriorityQueue<>();
	
	public DeliveryRestaurant() {
		
	}
	
	
	public DeliveryRestaurant(String name, double amountEarned, Order order, Queue<Order> deliveryLine) {
		this.name = name;
		this.amountEarned = amountEarned;
		this.order = order;
		this.deliveryLine = deliveryLine;
	}

	public void makeDelivery(Order order) {
		//This function delivers the order and adds their total delivery cost to the line before
		// removing them from the line
		//if the Order was placed over 1 hour ago, the customer should not be charged for the cost of delivery.
		if (deliveryLine.isEmpty()) {
			throw new NoSuchElementException ("There are no orders placed to be delivered!");
		} else {
			Order orderToBeDelivered = deliveryLine.peek();
			System.out.println("Now delivering to " + orderToBeDelivered.getCustomerName());
			if (calculateTimeDelay(orderToBeDelivered.getOrderTime()) > 3600000) {
				amountEarned += 0;
				System.out.println("Customer will not be charged for delivery delay!");
			}
			amountEarned += orderToBeDelivered.getDeliveryCost() + orderToBeDelivered.getOrderPrice();
			deliveryLine.poll();
		}
	}
	
	public static int calculateTimeDelay(LocalTime orderToBeDelivered) {
		Duration periodBetween = Duration.between(orderToBeDelivered, LocalTime.now());
		int age = (int) periodBetween.getSeconds();  //Returns the number of seconds the duration spans
		return age;		
	}
	
	public void receiveOrder(Order order) {
		//this function adds a new customer's order onto the queue
		if (deliveryLine.isEmpty()) {
			deliveryLine.add(order);
		} else {
			deliveryLine.add(order);
		}
	}
		
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAmountEarned() {
		return amountEarned;
	}


	public static void main(String[] args) {
//		IceCream chocolate = new IceCream("Chocolate", 6.00);
//		IceCream vanilla = new IceCream("Vanilla", 5.00);
//		IceCream strawberry = new IceCream("Vanilla", 15.00);
		
//		IceCreamShop dairyQueen = new IceCreamShop("Dairy Queen", new ArrayList<>(Arrays.asList(chocolate, vanilla)));
//		dairyQueen.addFlavor(strawberry);
		
//		Customer troy = new Customer("Troy", chocolate);
//		Customer sean = new Customer("Sean", chocolate);
//		Customer fred = new Customer("Fred", strawberry);
		
//		dairyQueen.addCustomer(sean);
		
//		IceCream troysIceCream = troy.getIceCream();
//		System.out.println(troysIceCream.getPrice());
	}

}
