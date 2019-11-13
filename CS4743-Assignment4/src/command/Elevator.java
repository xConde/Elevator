package command;

public class Elevator {
	Mediator mediator;
	Floor currentFloor;
	
	Elevator() {
		mediator = new ElevatorMediator();
		currentFloor = mediator.getFloor();
	}
	
	void pressButtonOne() {
		mediator.closeDoors();
		currentFloor = currentFloor.button1();
		System.out.println("1 pressed");
	}
	
	void pressButtonTwo() {
		mediator.closeDoors();
		currentFloor = currentFloor.button2();
		System.out.println("2 pressed");
	}
	
	void pressButtonThree() {
		mediator.closeDoors();
		currentFloor = currentFloor.button3();
		System.out.println("3 pressed");
	}

}
