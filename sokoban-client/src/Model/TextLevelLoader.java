package Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import levels.Box;
import levels.Floor;
import levels.GameObject;
import levels.Level;
import levels.Player;
import levels.Position;
import levels.Space;
import levels.Target;

public class TextLevelLoader implements LevelLoader{
	
	public TextLevelLoader() {}
	
	public Level loadLevel(InputStream in) {
		
		Level newLevel = new Level();
		String name;
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		ObjectFactory of = new ObjectFactory();
		String line= null;
		GameObject[][] map = null;
		int i;
		int height=0;
		int width=0;
		char[] charArr = null;
		Position start=new Position(0, 0);
		ArrayList <GameObject> targets=new ArrayList<>();
		int numOfTargets=0;
		ArrayList <GameObject> boxes=new ArrayList<>();
		
		//read first line to adjust level size
				
		try {
			line = br.readLine();
		} catch (IOException e) {
			System.out.println("error reading file size");
		}
		
			charArr= line.toCharArray();
			for( i=0; charArr[i]!='X'& i<4;i++)
			{
				height*=10;
				height += Character.getNumericValue(charArr[i]);
			}
			
			while( i<(line.length()-1))
			{	
				i++;
				width*=10;
				width += Character.getNumericValue(charArr[i]);
			}		
			
			//read second line to adjust level name
			
			try {
				line = br.readLine();
			} catch (IOException e) {
				System.out.println("error reading file name");
			}
			newLevel.setLevelName(line);
			name=line;
	
			//read level char's
			
			newLevel.setHeight(height);
			newLevel.setWidth(width);
			map = new GameObject[height][width];
			
			for (i=0; i<height; i++){
				try {
					line =br.readLine();
				} catch (IOException e) {
					System.out.println("error reading file");
				}
				if (line!=null){
					charArr = line.toCharArray();
					for(int j=0; j< width ;j++){
						if(charArr[j] == 'A')
						{
							map[i][j] = new Floor(false,false,new Player(new Position(i, j)));
							start.setPoint(i, j);
						}
						else if(charArr[j] == 'o')
						{
							Floor f=new Floor(true,false,new Space());
							map[i][j] = f ;
							numOfTargets++;
							Target t=new Target(new Position(i, j));
							targets.add(t);
						}
						else if(charArr[j]=='@')
						{	Floor f=new Floor(false,true,new Box(new Position(i, j)));
							map[i][j] = f ;
							boxes.add(f);
						}
						else
						{
							map[i][j] = of.getObj(charArr[j]);
						}
					}
				}
			}
			
			return new Level(name,width,height,map,start,start,numOfTargets,targets,boxes);
		}
	}
