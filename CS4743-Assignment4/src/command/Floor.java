package command;

/**
 * Floor abstract class. 
 *
 */
public abstract class Floor {
	Mediator mediator;
	
	/**
	 * Floor constructor
	 * @param mediator
	 */
	Floor(Mediator mediator) {
		this.mediator = mediator;		
	}
	
	abstract Floor button1();
	abstract Floor button2();
	abstract Floor button3();
	
	abstract Floor getState();
}
