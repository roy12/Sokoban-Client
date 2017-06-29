package levels;

import Model.MoveAbleObject;

public class Floor extends GameObject {

	private static final long serialVersionUID = 1L;
	
	private boolean target;
	private boolean containBox;
	private MoveAbleObject contain;
	
	public boolean isEmpty() 
	{
		if (contain instanceof Space)
		{
		return true;
		}
		else
		{
		return false;
		}
	}
	
	public Floor(Floor f)
	{
		this.target=f.isTarget();
		this.containBox=f.isContainBox();
		this.contain=f.getContain();
	}
	
	public Floor(Boolean target,Boolean containBox, MoveAbleObject contain) {
		
		this.target=target;
		this.containBox=containBox;
		this.contain=contain;
	}
	
	
	public boolean isContainBox() {
		return containBox;
	}



	public void setContainBox(boolean containBox) {
		this.containBox = containBox;
	} 
	public MoveAbleObject getContain() {
		return contain;
	}

	public void setContain(MoveAbleObject contain) {
		this.contain = contain;
	}

	public boolean isTarget() {
		return target;
	}

	public void setTarget(boolean target) {
		this.target = target;
	}
	
	
	public void switchContain(Floor f)
	{
		MoveAbleObject temp1=this.contain;
		this.contain=f.contain;
		f.setContain(temp1);
		
		Boolean temp2=this.containBox;
		this.containBox=f.containBox;
		f.setContainBox(temp2);
	}
	
	public char getType()
	{
		if(containBox)
		{
			return '@';
		}
		if(contain instanceof Player)
		{
			return 'A';
		}
		if(target)
		{
			return 'o';
		}
		return' ';
	}



	public Floor() {
		// TODO Auto-generated constructor stub
	}

	

}


