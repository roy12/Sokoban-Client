package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import levels.Level;

public class DataBaseManager {

	Socket sock; 
	PrintWriter writer; 
	BufferedReader reader; 
	ObjectInputStream objectReader; 
	ObjectOutputStream objectWriter; 

	public DataBaseManager(Socket connectedSock)
	{
		this.sock = connectedSock; 
		initIO(); 
	}

	private void initIO()
	{
		try { 
			 this.writer = new PrintWriter(sock.getOutputStream(),true); 
			 reader = new BufferedReader(new InputStreamReader(sock.getInputStream())); 
			 objectWriter = new ObjectOutputStream(sock.getOutputStream()); 
			 objectReader = new ObjectInputStream(sock.getInputStream()); 
			} catch (IOException e) { 
		 			e.printStackTrace(); 
		} 
	} 
	
	public String getSolution(Level lvl)
	{ 
	try { 
		writer.println("getSolution"); 
		objectWriter.writeObject(lvl); 
		objectWriter.flush(); 
		String solution = reader.readLine(); 
		return solution; 
		}
	catch (IOException e)
		{ 
		e.printStackTrace(); 
		return null; 
	 	} 		 		 
	} 


}
