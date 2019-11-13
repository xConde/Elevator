package command;

public class Floor1 extends Floor {

	Floor1(Mediator mediator) {
		super(mediator);
	}
	
	@Override
	Floor button1() { System.out.println("Nothing happens"); return this; }
	
	@Override
	Floor button2() { return mediator.moveUp(2).getState(); }
	
	@Override
	Floor button3() { return mediator.moveUp(3).getState(); }
	
	@Override
	public void moveFloor() {}
	
	@Override
	public Floor getState() {
		System.out.println("*ding* The elevator arrives at Floor 1");
		mediator.openDoors();
		return this;
	}
}
