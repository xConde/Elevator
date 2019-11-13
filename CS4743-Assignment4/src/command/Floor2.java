package command;

/**
 * Floor2 class. Extends the abstract Floor class. Overrides buttons for this floor and overrides the state as elevator arriving at floor 2.
 *
 */
public class Floor2 extends Floor {

	/**
	 * Floor 2 constructor
	 * @param mediator
	 */
	Floor2(Mediator mediator) {
		super(mediator);
	}
	
	@Override
	Floor button1() { return mediator.moveUp(1).getState(); }
	
	@Override
	Floor button2() { System.out.println("Nothing happens"); return this; }
	
	@Override
	Floor button3() { return mediator.moveUp(3).getState(); }
	
	/**
	 * getState. Retrieves current state pertaining to Floor2. 
	 */
	@Override
	public Floor getState() {
		System.out.println("*ding* The elevator arrives at Floor 2");
		mediator.openDoors();
		return this;
	}

}
