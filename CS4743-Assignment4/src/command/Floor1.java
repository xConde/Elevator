package command;

/**
 * Floor1 class. Extends the abstract Floor class. Overrides buttons for this floor and overrides the state as elevator arriving at floor 1.
 *
 */
public class Floor1 extends Floor {

	/**
	 * Floor1 constructor
	 * @param mediator
	 */
	Floor1(Mediator mediator) {
		super(mediator);
	}
	
	@Override
	Floor button1() { System.out.println("Nothing happens"); return this; }
	
	@Override
	Floor button2() { return mediator.moveUp(2).getState(); }
	
	@Override
	Floor button3() { return mediator.moveUp(3).getState(); }
	
	/**
	 * getState. Retrieves current state pertaining to Floor1. 
	 */
	@Override
	public Floor getState() {
		System.out.println("*ding* The elevator arrives at Floor 1");
		mediator.openDoors();
		return this;
	}
}
