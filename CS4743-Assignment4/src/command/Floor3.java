package command;

/**
 * Floor3 class. Extends the abstract Floor class. Overrides buttons for this floor and overrides the state as elevator arriving at floor 3.
 *
 */
public class Floor3 extends Floor {
	
	/**
	 * Floor 3 constructor
	 * @param mediator
	 */
	Floor3(Mediator mediator) {
		super(mediator);
	}
	
	@Override
	Floor button1() { return mediator.moveUp(1).getState(); }
	
	@Override
	Floor button2() { return mediator.moveUp(2).getState(); }
	
	@Override
	Floor button3() { System.out.println("Nothing happens"); return this; }
	
	/**
	 * getState. Retrieves current state pertaining to Floor3. 
	 */
	@Override
	public Floor getState() {
		System.out.println("*ding* The elevator arrives at Floor 3");
		mediator.openDoors();
		return this;
	}

}
