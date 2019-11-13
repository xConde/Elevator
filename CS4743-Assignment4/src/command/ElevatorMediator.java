package command;

public class ElevatorMediator implements Mediator {
	
	Boolean doorOpen;
	Floor currentFloor;
	Floor[] elevatorLevels;

	
	ElevatorMediator() {
		elevatorLevels = new Floor[]  { new Floor1(this), new Floor2(this), new Floor3(this) };
		currentFloor = elevatorLevels[0];
		doorOpen = true;
	}
	
	@Override
	public void openDoors() {
		if (!doorOpen)
			System.out.println("Doors are open");
		doorOpen = true;
	}
	
	@Override
	public void closeDoors() {
		if (doorOpen)
			System.out.println("Doors are closed");
		doorOpen = false;
	}
	
	public Floor moveUp(int requestedFloor) {
		System.out.println("Going up...");
		return elevatorLevels[requestedFloor-1];
	}

	public Floor moveDown(int requestedFloor) {
		System.out.println("Going down...");
		return elevatorLevels[requestedFloor-1];
	}

	public Floor getFloor() { return currentFloor; }
	
}
