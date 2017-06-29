package Model;

import java.io.InputStream;

import levels.Level;

public interface LevelLoader {
	public default Level loadLevel(InputStream in)
	{
		return null;
	}
}
