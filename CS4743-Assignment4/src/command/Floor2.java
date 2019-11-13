package command;

public class Floor2 extends Floor {

	Floor2(Mediator mediator) {
		super(mediator);
	}
	
	@Override
	Floor button1() { return mediator.moveUp(1).getState(); }
	
	@Override
	Floor button2() { System.out.println("Nothing happens"); return this; }
	
	@Override
	Floor button3() { return mediator.moveUp(3).getState(); }
	
	@Override
	public void moveFloor() {}
	
	@Override
	public Floor getState() {
		System.out.println("*ding* The elevator arrives at Floor 2");
		mediator.openDoors();
		return this;
	}

}
