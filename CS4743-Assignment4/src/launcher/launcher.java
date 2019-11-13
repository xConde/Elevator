package launcher;

import command.*;
/**
 * launcher class. Invokes the Elevator: State and Mediator program.
 *
 */
public class launcher {
	public static void main(String[] args) {
		Elevator elevator = new Elevator();
		
    	elevator.press2();
    	elevator.press1();
    	elevator.press3();
    	elevator.press3();
    	elevator.press1();	
	}
}
