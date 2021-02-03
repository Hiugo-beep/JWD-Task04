package by.jwd.clientserver.main;

import by.jwd.clientserver.client.Client;

public class PrintTextInfo {
	public static void print( Client client ) {
		Object text = client.getTextFromServer();
		boolean isEmpty = text == null ;
		if( !isEmpty ) {	
			System.out.println(text.toString());	
		}
	}
}
