package Model;

import java.io.IOException;
import java.io.OutputStream;

import levels.Level;

public interface LevelSaver {
	
	
	//public default void saveLevel(Level lv) throws IOException{}
	
	public default Level saveLevel(OutputStream out){
		return null;
}
}