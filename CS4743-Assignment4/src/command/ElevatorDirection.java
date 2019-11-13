package command;

/**
 * ElevatorDirection enum.
 *
 */
public enum ElevatorDirection {
    ELEVATOR_UP("Going up..."), ELEVATOR_DOWN("Going down..."), ELEVATOR_HOLD("Nothing happens");
	
	private final String directionText;
	
	/**
	 * ElevatorDirection constructor takes in a specified text for elevator direction.
	 */
	ElevatorDirection(String directionText){
		this.directionText = directionText;
	}
	
	public String getElevatorDirection() {
		return this.directionText;
	} 
}
