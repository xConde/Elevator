package command;

/**
 * ElevatorMediator class implements the interface mediator. Adds a lot of context for the user and maintains currentFloor.
 *
 */
public class ElevatorMediator implements Mediator {
	
	Boolean doorOpen;
	Floor currentFloor;
	Floor[] elevatorLevels;

	/**
	 * ElevatorMediator constructor
	 */
	ElevatorMediator() {
		elevatorLevels = new Floor[]  { new Floor1(this), new Floor2(this), new Floor3(this) };
		currentFloor = elevatorLevels[0];
		doorOpen = true;
	}
	
	/**
	 * openDoors method. Sets the boolean doorOpen to true and if it hasn't announced that doors are open yet it will.
	 */
	@Override
	public void openDoors() {
		if (!doorOpen)
			System.out.println("Doors are open");
		doorOpen = true;
	}
	
	/**
	 * closeDoors method. Sets the boolean doorOpen to false and if it hasn't announced that doors are closed yet it will.
	 */
	@Override
	public void closeDoors() {
		if (doorOpen)
			System.out.println("Doors are closed");
		doorOpen = false;
	}
	
	/**
	 * moveup method. Announces going up and moves the elevatorLevels to the requestedFloor
	 */
	public Floor moveUp(int requestedFloor) {
		System.out.println("Going up...");
		return elevatorLevels[requestedFloor-1];
	}

	/**
	 * moveDown method. Announces going up and moves the elevatorLevels to the requestedFloor
	 */
	public Floor moveDown(int requestedFloor) {
		System.out.println("Going down...");
		return elevatorLevels[requestedFloor-1];
	}

	/**
	 * getFloor method. Returns currentFloor.
	 */
	public Floor getFloor() { return currentFloor; }
	
}
