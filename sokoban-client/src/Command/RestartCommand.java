package Command;

import Model.MyModel;

public class RestartCommand extends Command {
	private MyModel model;
	
	public RestartCommand(MyModel m)
	{
		this.model=m;
	}
	
	public boolean isExit()
	{
		return false;
	}
	
	public void execute() 
	{	
		model.restart();
	}
}
