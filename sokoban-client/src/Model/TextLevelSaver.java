package Model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import levels.Level;

public class TextLevelSaver implements LevelSaver{
	
	public TextLevelSaver(Level lvl,String str) throws IOException {
		
		BufferedWriter w = new BufferedWriter(new FileWriter("./recources\\"+str));	//to change path	
		w.write(String.valueOf(lvl.getHeight()));
		w.write(String.valueOf('X'));
		w.write(String.valueOf(lvl.getWidth()));
		w.newLine();
		for(int i=0;i<lvl.getHeight();i++){
			for(int j=0;j<lvl.getWidth();j++){
				w.write(lvl.getMap()[i][j].getType());
			}
			w.newLine();
		}
		w.close();
		System.out.println("save ok");
	}
	
	public TextLevelSaver() {
		// TODO Auto-generated constructor stub
	}
	
	
}
