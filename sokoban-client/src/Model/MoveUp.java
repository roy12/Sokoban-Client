package Model;

import Model.Policy.MovementPolicy;
import levels.Level;
import levels.Position;

public class MoveUp implements Movement {
	
	public MoveUp() {
		// TODO Auto-generated constructor stub
	}
	
	
public MoveUp(Level lvl) {
	Position to1, to2;
	to1 =new Position(lvl.getPl());
	to1.setX(to1.getX()-1);
	to2 =new Position(lvl.getPl());
	to2.setX(to2.getX()-2);
	
	@SuppressWarnings("unused")
	MovementPolicy mp = new MovementPolicy(lvl,lvl.getPl(),to1,to2);
}

}
