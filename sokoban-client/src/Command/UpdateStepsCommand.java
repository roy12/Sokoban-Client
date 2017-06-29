package Command;

import Model.Model;

public class UpdateStepsCommand extends Command {
	
	private Model model;
	
	public UpdateStepsCommand(Model model){
		this.model = model;
	}
	

	@Override
	public void execute() {
		if(params != null){
		model.updateTime(Integer.parseInt(params.removeFirst()));
		}
	}

}
