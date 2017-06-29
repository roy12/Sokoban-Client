package Model;

import levels.Box;
import levels.Floor;
import levels.GameObject;
import levels.Space;
import levels.Wall;

public class ObjectFactory {
	public ObjectFactory() {
		
	}
	public GameObject getObj(char c){		
		if(c=='#')
		{
			
			return new Wall();
		}
				
		else if( c== ' ')
			return new Floor(false,false,new Space());
		else
			return null;
	}

}
