package levels;

import Model.MoveAbleObject;

public class Box extends MoveAbleObject{
	
	private static final long serialVersionUID = 1L;
	private Position pos;
	
	public Box()
	{}
	
	public Box(Position pos) {
		this.setPos(pos);		
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}
	
	

}
