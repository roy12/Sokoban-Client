package Model;

import java.beans.XMLDecoder;
import java.io.InputStream;

import levels.Level;

public class XMLLevelLoader implements LevelLoader {
	public XMLLevelLoader() {
	}
	
	public Level loadLevel(InputStream in) {
		Level newLevel = new Level();		
		XMLDecoder xd = new XMLDecoder(in);
		newLevel = (Level) xd.readObject();
		xd.close();
		return newLevel;
		
	}
	
}
