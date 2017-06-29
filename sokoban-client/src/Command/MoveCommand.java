package Command;

import Model.MyModel;

public class MoveCommand extends Command {
	private MyModel model;
	
public MoveCommand(MyModel m) {
	this.model=m;
	}

public boolean isExit()
{
	return false;
}

@Override
public void execute() {
	String direction = params.get(0);		
	model.move(direction);
	
}
	
	

}
