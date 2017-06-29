package Command;


import Model.MyModel;

public class ExitCommand extends Command{
	private MyModel model;
	
public ExitCommand(MyModel m)  {
	this.model=m;
}
	public void execute() {
	model.exit();
	}
	public boolean isExit()
	{
		return true;
	}
	
}


