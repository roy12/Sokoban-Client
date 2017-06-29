package Controller;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import Command.Command;

public class Controller {
	private BlockingQueue<Command> queue;
	private boolean isStopped = false;
	
	public Controller() {
		queue = new ArrayBlockingQueue<Command>(10);		
	}
	
	public void insertCommand(Command command) {
		if(command!=null)
		{
		try {
			queue.put(command);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		}
	}
	
	public void start() {
		Thread thread = new Thread(new Runnable() {
			
			
			public void run() {
				while (!isStopped) {
					try {
						Command cmd = queue.poll(1, TimeUnit.SECONDS);
						if (cmd != null)
						{
							
							if (cmd.isExit())
							{								
								stop();
							}
							cmd.execute();
							
						}
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		});
		thread.start();
	}
	
	public void stop() {
		isStopped = true;
	}	
	
}

