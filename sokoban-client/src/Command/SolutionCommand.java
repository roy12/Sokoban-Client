package Command;

import Model.MyModel;

public class SolutionCommand extends Command{	
	
		private MyModel model;
		
		public SolutionCommand(MyModel m)
		{
			this.model=m;
		}

		public boolean isExit()
		{
			return false;
		}

		public void execute() 
		{					
			try {
				model.showFullSolution();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
}
