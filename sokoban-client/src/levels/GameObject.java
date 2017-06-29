package levels;

import java.io.Serializable;

public class GameObject implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Position pos;
	
	public boolean isEmpty(){return false;};
		
	public GameObject() {
		
	}	
	
	public char getType()
	{
		return ' ';

	}
	
	public char getChar(){
		if (this instanceof Wall)
			return '#';
		//problem need to replace to floor.gettype 
		else if(this instanceof Player)
			return 'A';
		else if (this instanceof Box)
			return '@';
		else if (this instanceof Target)
			return 'o';
		return ' ';
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

	public boolean isContainBox() {
		
		return false;
	}
	
	
	

}
