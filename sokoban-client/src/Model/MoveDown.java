package Model;

import Model.Policy.MovementPolicy;
import levels.Level;
import levels.Position;

public class MoveDown implements Movement {
	public MoveDown() {
		// TODO Auto-generated constructor stub
	}
public MoveDown(Level lvl) {
	Position to1, to2;
	to1 = new Position(lvl.getPl());
	to1.setX(to1.getX()+1);
	to2 = new Position(lvl.getPl());
	to2.setX(to2.getX()+2);
	
	@SuppressWarnings("unused")
	MovementPolicy mp = new MovementPolicy(lvl,lvl.getPl(),to1,to2);
}

}
