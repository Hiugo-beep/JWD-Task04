package by.jwd.clientserver.main;

import by.jwd.clientserver.client.Client;
import by.jwd.clientserver.server.Server;


public class Main {

	public static void main (String[] args ) {
		
		Runnable server  = Server.getInstance();
		Thread serverThread = new Thread(server);
		serverThread.start();
		
		String request = "1)";
		Client client = new Client();
		client.setRequest(request);
		client.transferServer();

		PrintTextInfo.print(client);
	}
}
