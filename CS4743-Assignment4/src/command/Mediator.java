package command;

public interface Mediator {
	Floor getFloor();
	void openDoors();
	void closeDoors();
	Floor moveUp(int requestedFloor);
	Floor moveDown(int requestedFloor);
	
}
