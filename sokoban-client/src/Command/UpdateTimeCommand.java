package Command;

import Model.Model;

public class UpdateTimeCommand extends Command {
	
	private Model model;
	
	public UpdateTimeCommand(Model model){
		this.model = model;
	}
	

	@Override
	public void execute() {
		if(params != null){
		model.updateTime(params.removeFirst());
		}
	}

}
