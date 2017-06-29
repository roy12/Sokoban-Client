package Command;

import Model.MyModel;
import view.View;

public class DisplayLevelCommand extends Command{

	private MyModel model;
	
	public DisplayLevelCommand(MyModel model, View view) {
		this.model = model;
	}	
	
	@Override
	public void execute() {
		model.display();
	}
	public boolean isExit()
	{
		return false;
	}

}