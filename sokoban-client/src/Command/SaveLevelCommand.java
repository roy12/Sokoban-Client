package Command;

import java.io.IOException;
import Model.MyModel;

public class SaveLevelCommand extends Command {
	private MyModel model;
	
	public SaveLevelCommand(MyModel m) {
		this.model=m;
	}
	
	
	public boolean isExit()
	{
		return false;
	}
	
	@Override
	public void execute() {
		String saveAs = params.get(0);
		try {
			model.save(saveAs);
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	
}

