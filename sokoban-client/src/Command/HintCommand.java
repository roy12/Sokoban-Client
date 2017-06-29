package Command;

import Model.MyModel;

public class HintCommand  extends Command{
	
		private MyModel model;
		
		public HintCommand(MyModel m)
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
				model.getHint();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
	}