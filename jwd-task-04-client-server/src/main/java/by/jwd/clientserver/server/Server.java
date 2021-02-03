package by.jwd.clientserver.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import by.jwd.clientserver.controller.Controller;
import by.jwd.clientserver.controller.impl.ControllerImpl;
import by.jwd.clientserver.entity.Text;


public class Server implements Runnable{
	private static final Server instance = new Server();
	private static final Logger logger = LoggerFactory.getLogger(Server.class);
	
	private int port = 3545;
	private Server() {}
	
	public void run()
	{
		logger.debug("run");
		try {
			this.create();
		}
		catch(IOException ex) {
			logger.error("IOException error", ex);
		}
	}
	
	public void create() throws IOException {
		ServerSocket serverSock = new ServerSocket(port);
		String request = "";
		while(true) {
			Socket sock = serverSock.accept();
			
			InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
			BufferedReader reader = new BufferedReader (streamReader);
			request = reader.readLine();
			System.out.println("SERVER: " + request);		
			reader.close();
			
			sock = serverSock.accept();
			
			Controller controller = new ControllerImpl();
			Text text = controller.doTask(request);
			ObjectOutputStream writer = new ObjectOutputStream(sock.getOutputStream());
			writer.writeObject(text);
			
			writer.close();
		}
	}
	

	public static Server getInstance() {
		return instance;
	}
}