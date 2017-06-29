package levels;

public class Wall extends GameObject {
	
private static final long serialVersionUID = 1L;
	
	public boolean isEmpty() {
		return false;
	}
	
	public Wall() {
		
	}
	
	public char getType()
	{return '#';}

}
