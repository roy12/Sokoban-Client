package levels;

public class Target extends GameObject {
	
	private Position pos;
	
public Target() {
	// TODO Auto-generated constructor stub
}

public Target(Position pos) {
	this.pos=pos;
}

public Position getPos() {
	return pos;
}

public void setPos(Position pos) {
	this.pos = pos;
}

}
