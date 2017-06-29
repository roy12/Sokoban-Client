package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import levels.Level;

public class GuiDisplayer extends Canvas{
	
	public StringProperty wallFileName;
	public StringProperty boxFileName;
	public StringProperty targetFileName;
	public StringProperty playerFileName;
	public StringProperty floorFileName;
	public StringProperty finishFileName;
	public StringProperty moveUpFileName;
	public StringProperty moveDownFileName;
	public StringProperty moveLeftFileName;
	public StringProperty moveRightFileName;
	public StringProperty openPageFileName;
	
	private Image wall;
	private Image box;
	private Image player;
	private Image target;
	private Image floor;
	private Image finish;
	private Level lvl = null;
	private Image movedown;
	private Image moveup;
	private Image moveright;
	private Image moveleft;
	private Image openPage;
	
	public GuiDisplayer() throws FileNotFoundException {
		
		
		wallFileName = new SimpleStringProperty();
		boxFileName = new SimpleStringProperty();
		targetFileName = new SimpleStringProperty();
		playerFileName = new SimpleStringProperty();
		floorFileName = new SimpleStringProperty();
		finishFileName = new SimpleStringProperty();
		moveUpFileName = new SimpleStringProperty();
		moveDownFileName = new SimpleStringProperty();
		moveLeftFileName = new SimpleStringProperty();
		moveRightFileName = new SimpleStringProperty();
		openPageFileName = new SimpleStringProperty();
		
		
	}
	
	public void finishLevel()
	{
		
		double W = this.getWidth();
		double H = this.getHeight();
		double w = W / lvl.getMap()[0].length;
		double h = H / lvl.getMap().length;
		
		GraphicsContext gc = getGraphicsContext2D();
		
		gc.clearRect(0, 0, W, H);		
		gc.drawImage(finish , 5,5, W, H);
	
	}
	

	public void setData(Level lvl) throws FileNotFoundException{
		this.lvl = lvl;
		redraw();
	}

	public void redraw() throws FileNotFoundException{
		

		double W = this.getWidth();
		double H = this.getHeight();
		double w = W / lvl.getMap()[0].length;
		double h = H / lvl.getMap().length;
		
		wall = new Image(new FileInputStream(wallFileName.get()));
		box = new Image(new FileInputStream(boxFileName.get()));
		target = new Image(new FileInputStream(targetFileName.get()));
		player = new Image(new FileInputStream(playerFileName.get()));
		floor = new Image(new FileInputStream(floorFileName.get()));
		finish = new Image(new FileInputStream(finishFileName.get()));
		movedown = new Image(new FileInputStream(moveDownFileName.get()));
		moveup = new Image(new FileInputStream(moveUpFileName.get()));
		moveright = new Image(new FileInputStream(moveRightFileName.get()));
		moveleft = new Image(new FileInputStream(moveLeftFileName.get()));
		
		
		
		GraphicsContext gc = getGraphicsContext2D();
		gc.clearRect(0, 0, W, H);
		
		
		
		for(int i=0;i<this.lvl.getHeight();i++){	
			for(int j=0;j<this.lvl.getWidth();j++){
				if(lvl.getMap()[i][j].getType()=='#'){	
					gc.drawImage(wall, j*w, i*h, w, h);					
				}
				else if(lvl.getMap()[i][j].getType()==' '){
					gc.drawImage(floor, j*w, i*h, w, h);
				}
				else if(lvl.getMap()[i][j].getType()=='@'){
					gc.drawImage(box ,j*w, i*h, w, h);
				}
				else if(lvl.getMap()[i][j].getType()=='A'){
					if (lvl.getLastMove().equals("Down"))
						gc.drawImage(movedown , j*w, i*h, w, h);
					else if(lvl.getLastMove().equals("Up"))
					{
						gc.drawImage(moveup , j*w, i*h, w, h);
					}
					else if(lvl.getLastMove().equals("Left"))
					{
						gc.drawImage(moveleft , j*w, i*h, w, h);
					}
					else if(lvl.getLastMove().equals("Right"))
					{
						gc.drawImage(moveright , j*w, i*h, w, h);
					}
				}
				else if(lvl.getMap()[i][j].getType()=='o'){
					gc.drawImage(target , j*w, i*h, w, h);
				}
		}
		
}
	
		
}
	
	public String getFinishFileName() {
		return finishFileName.get();
	}

	public void setFinishFileName(String finishFileName) {
		this.finishFileName.set(finishFileName);
	}
	
	

	public void displayOpenPage()
	{
		try {
			openPage = new Image(new FileInputStream(openPageFileName.get()));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Image openPage  = new Image(new FileInputStream("./recources/OpenGame/Open_Game2.png"));
		if(openPage!=null){
		GraphicsContext gc = getGraphicsContext2D();
		double w = getWidth();
		double h = getHeight();
		
		gc.drawImage(openPage,0,0);
		
		}
	}

	public String getWallFileName() {
		return wallFileName.get();
	}

	public void setWallFileName(String wallFiLEName) {
		this.wallFileName.set(wallFiLEName);
	}

	public String getBoxFileName() {
		return boxFileName.get();
	}

	public void setBoxFileName(String boxFileName) {
		this.boxFileName.set(boxFileName);
	}

	public String getTargetFileName() {
		return targetFileName.get();
	}

	public void setTargetFileName(String targetFileName) {
		this.targetFileName.set(targetFileName);
	}

	public String getPlayerFileName() {
		return playerFileName.get();
	}

	public void setPlayerFileName(String playerFileName) {
		this.playerFileName.set(playerFileName);
	}

	public String getFloorFileName() {
		return floorFileName.get();
	}

	public void setFloorFileName(String floorFileName) {
		this.floorFileName.set(floorFileName);
	}

	public String getMoveUpFileName() {
		return moveUpFileName.get();
	}

	public void setMoveUpFileName(String moveUpFileName) {
		this.moveUpFileName.set(moveUpFileName);
	}

	public String getMoveDownFileName() {
		return moveDownFileName.get();
	}

	public void setMoveDownFileName(String moveDownFileName) {
		this.moveDownFileName.set(moveDownFileName);
	}

	public String getMoveLeftFileName() {
		return moveLeftFileName.get();
	}

	public void setMoveLeftFileName(String moveLeftFileName) {
		this.moveLeftFileName.set(moveLeftFileName);
	}

	public String getMoveRightFileName() {
		return moveRightFileName.get();
	}

	public void setMoveRightFileName(String moveRightFileName) {
		this.moveRightFileName.set(moveRightFileName);
	}

	public String getOpenPageFileName() {
		return openPageFileName.get();
	}

	public void setOpenPageFileName(String openPageFileName) {
		this.openPageFileName.set(openPageFileName);
	}
}