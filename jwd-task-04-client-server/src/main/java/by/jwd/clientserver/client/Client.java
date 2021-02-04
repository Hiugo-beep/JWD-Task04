package by.jwd.clientserver.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Client {
	private Socket socket = null;
	private int serverPort = 0;
	private String request = "1)";
	private static String localHost = "127.0.0.1";
	private Object textFromServer = null;
	private static final Logger logger = LoggerFactory.getLogger(Client.class);
	
	private void write() throws IOException{
		PrintWriter writer = new PrintWriter(socket.getOutputStream());
		String advice = this.request;
		writer.println(advice);
		writer.close();
	}
	
	private void read() throws IOException, ClassNotFoundException {
		
		ObjectInputStream reader = new ObjectInputStream(socket.getInputStream());
		textFromServer = reader.readObject();	
		reader.close();
	}
	
	private void createClient() throws IOException{
		this.socket = new Socket(localHost  ,serverPort);
	}

	private void connectClientToServer() {
		logger.debug("Client");
		try {
			this.createClient();
		} 
		catch (IOException ex){
			logger.error("IOException error", ex);
		}
	}
	
	public Client() {
		this.serverPort = 3545;
	}
	public Client(int port) {
		this.serverPort = port;
	}
	
	public void transferServer(){
		this.connectClientToServer();
		logger.debug("transferServer");
		try {
			this.write();
			this.createClient();
			this.read();
		} catch(IOException ex) {
			logger.error("IOException error", ex);
		} catch(ClassNotFoundException ex) {
			logger.error("ClassNotFoundException error", ex);
		}		
	}
	
	public void setRequest(String request) {
		this.request = request;
	}
	
	public Object getTextFromServer() {
		return textFromServer;
	}
}

