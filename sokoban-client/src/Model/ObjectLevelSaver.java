package Model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import levels.Level;

public class ObjectLevelSaver implements LevelSaver{
	
	public ObjectLevelSaver() {
		// TODO Auto-generated constructor stub
	}
		
	public ObjectLevelSaver(Level lvl,String str) throws IOException {
		//FileOutputStream out = new FileOutputStream("./recources\\"+str); //to change path
		ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("./recources\\"+str));
		objOut.writeObject(lvl);
		objOut.close();
	}
}