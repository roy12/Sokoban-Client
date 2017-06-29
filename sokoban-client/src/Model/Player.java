package Model;

import Model.MoveAbleObject;
import levels.Position;

public class Player extends MoveAbleObject{
	
	private static final long serialVersionUID = 1L;

	private Position location;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(Position location) {
		this.location=location;
	}
	
	public Position getLocation() {
		return location;
	}

	public void setLocation(Position location) {
		this.location = location;
	}
}
//update location