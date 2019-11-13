package command;

/**
 * Elevator class. Creates a public constructor that maintains the mediator and current floor. Has three methods for buttons
 * to move the elevator to a requested floor. 
 *
 */
public class Elevator {
	Mediator mediator;
	Floor currentFloor;
	
	/**
	 * Elevator constructor
	 */
	public Elevator() {
		mediator = new ElevatorMediator();
		currentFloor = mediator.getFloor();
	}
	
	/**
	 * press1 method. Announces when called "1 pressed" and closes the doors. Sets the current floor as floor1. 
	 */
	public void press1() {
		System.out.println("1 pressed");
		mediator.closeDoors();
		currentFloor = currentFloor.button1();
	}
	
	/**
	 * press2 method. Announces when called "2 pressed" and closes the doors. Sets the current floor as floor2. 
	 */
	public void press2() {
		System.out.println("2 pressed");
		mediator.closeDoors();
		currentFloor = currentFloor.button2();
	}
	
	/**
	 * press3 method. Announces when called "3 pressed" and closes the doors. Sets the current floor as floor3. 
	 */
	public void press3() {
		System.out.println("3 pressed");
		mediator.closeDoors();
		currentFloor = currentFloor.button3();
	}

}
