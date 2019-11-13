package command;

/**
 * Mediator interface. Used by ElevatorMediator. 
 *
 */
public interface Mediator {
	void openDoors();
	void closeDoors();
	Floor moveUp(int requestedFloor);
	Floor moveDown(int requestedFloor);
	Floor getFloor();
}
