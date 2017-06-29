package Command;


import java.util.LinkedList;

public abstract class Command 
{	
	protected LinkedList<String> params;
	
	public void setParams(LinkedList<String> params) {
		this.params = params;
	}
	
	public boolean isExit()
	{
		return false;
	}
	public abstract void execute();
}
		
	
