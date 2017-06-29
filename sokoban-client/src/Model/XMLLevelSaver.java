package Model;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import levels.Level;

public class XMLLevelSaver implements LevelSaver {
	
	public XMLLevelSaver() {
		// TODO Auto-generated constructor stub
	}
		public XMLLevelSaver(Level lvl,String str) throws IOException {
			//BufferedOutputStream out = new BufferedOutputStream( new FileOutputStream("./recources\\"+str)); //to change path
			XMLEncoder xmlOut = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("./recources\\"+str)));
			xmlOut.writeObject(lvl);
			xmlOut.close();
		}
}
