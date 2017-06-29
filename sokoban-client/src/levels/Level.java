package levels;

import java.io.Serializable;
import java.util.ArrayList;


public class Level implements Serializable {
	

	private String levelName;
	private int difficulty;	
	private int time;	
	private int steps;
	
	
	private GameObject[][] map;
	private int width;
	private int height;
	private Position start;
	private Position pl;//player location
	private int numOfTargets;
	private ArrayList <GameObject> targets;
	private GameObject[][] backupmap;
	String lastMove;
	private ArrayList <GameObject> boxes;
	
	
	
	public String getLastMove() {
		return lastMove;
	}

	public void setLastMove(String lastMove) {
		this.lastMove = lastMove;
	}

	public GameObject[][] getBackupmap() {
		return backupmap;
	}

	public void setBackupmap(GameObject[][] backupmap) {
		this.backupmap = backupmap;
	}

	public Level (Level lvl) {
		
		//hibernate
		this.difficulty=lvl.getDifficulty();
		this.time=lvl.getTime();
		this.steps=lvl.getSteps();
		this.levelName=lvl.getLevelName();
		
		/*
		time = 0;
		steps = 0;
		levelName = " ";
		*/
		
		this.width=lvl.getWidth();
		this.height=lvl.getHeight();
		this.map=lvl.getMap();
		this.start=lvl.getStart();
		this.pl=lvl.getPl();
		this.numOfTargets=lvl.getNumOfTargets();
		lastMove="Down";
		this.targets=targets;
		this.boxes=boxes;
	}
	
	public Level (String name,int width,int height,GameObject[][] map,Position start,Position pl, int numOfTargets,ArrayList <GameObject> targets,ArrayList <GameObject> boxes) {
		this.width=width;
		this.height=height;
		this.map=map;
		this.backupmap=map;
		this.start=start;
		this.pl=pl;
		this.numOfTargets=numOfTargets;
		this.targets=targets;
		lastMove="Down";
		this.boxes=boxes;
		this.levelName = name;
	}
public Level() {
	// TODO Auto-generated constructor stub
}

	public GameObject[][] getMap() {
		return map;
	}

	public void setMap(GameObject[][] map) {
		this.map = map;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Position getStart() {
		return start;
	}

	public void setStart(Position start) {
		this.start = start;
	}

	public Position getPl() {
		return pl;
	}

	public void setPl(Position pl) {
		this.pl = pl;
	}

	public int getNumOfTargets() {
		return numOfTargets;
	}

	public void setNumOfTargets(int numOfTargets) {
		this.numOfTargets = numOfTargets;
	}

	public ArrayList <GameObject> getTargets() {
		return targets;
	}

	public void setTargets(ArrayList <GameObject> targets) {
		this.targets = targets;
	}
	
	public boolean isComplete()
	{
		boolean flag=true;
		for (int i=0; i<targets.size(); i++) 
		{	
			Position p=new Position(targets.get(i).getPos());			
			if (!map[p.getX()][p.getY()].isContainBox())
			{
				flag=false;
			}
		}
		return flag;
	}

	public ArrayList<GameObject> getBoxes() {
		return boxes;
	}

	public void setBoxes(ArrayList<GameObject> boxes) {
		this.boxes = boxes;
	}
	
	public boolean posiblePosition(Position pos)
	{
		if(pos.getX()<0||pos.getX()>width||pos.getY()<0||pos.getY()>height)
			return false;
		else
			return true;
	}
	public GameObject getGameObjectByPosition(Position p)
	{
		GameObject go=map[p.getX()][p.getY()];		
		return go;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	
	public boolean equals(Object arg0) {
		Level l = (Level) arg0;
		if(this.levelName.compareTo(l.getLevelName())==0)
			return true;
		else return false;
	}
	
}
