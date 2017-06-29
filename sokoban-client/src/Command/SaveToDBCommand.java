package Command;
import Model.Model;
import view.View;
public class SaveToDBCommand extends Command {
	
	private Model model;
	
	public SaveToDBCommand(Model model,View view) {
		this.model = model;
	}

	@Override
	public void execute() {

		model.saveToDB(params.removeFirst());
		

	}

}
