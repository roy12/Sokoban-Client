package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import levels.Level;

public class Client {

	public void start(String ip,int port)
	{
		try{
			Socket server = new Socket(ip,port);
			System.out.println("Connected to server !");
			
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader serverInput = new BufferedReader(new InputStreamReader(server.getInputStream()));
			
			PrintWriter outToServer = new PrintWriter(server.getOutputStream());
			PrintWriter outToScreen = new PrintWriter(System.out);
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					readInputAndSend(userInput,outToServer);
					
				}
			}).start();
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					readInputAndSend(serverInput,outToScreen);
					
				}
			}).start();
			 
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private void readInputAndSend(BufferedReader in,PrintWriter out)
	{
		String line;
		try {
			while(!(line = in.readLine()).equals("Exit"))
			{
				out.println(line);
				out.flush();
			}
			out.println(line);
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String solveLevel(Level lvl)
	{
		String str=null;
		
		return str;
	}

}


