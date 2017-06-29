package Model;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import levels.Level;


public class ObjectLevelLoader implements LevelLoader{

	public Level loadLevel(InputStream in) {
		Level newLevel = new Level();

		try {
			ObjectInputStream os = new ObjectInputStream(in);
			try {
				newLevel = (Level) os.readObject();
			} catch (ClassNotFoundException e) {				
				System.out.println("error in objectOutputStream");
			}
			os.close();
		} catch (IOException e) {			
			System.out.println("error from objectLoader");
		}
		return newLevel;
	}
	
	public ObjectLevelLoader() {
		// TODO Auto-generated constructor stub
	}
	
	}
