package by.jwd.clientserver.reader.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Pattern;

import by.jwd.clientserver.reader.ParserReader;

public class ParserReaderImpl implements ParserReader{
	private static int numberBytesToRead = 500;
	private int bytesRead;
	private String fileRead;
	private int bytesAvailable;
	
	public ParserReaderImpl(){
		this.bytesAvailable = 0;
		this.bytesRead = numberBytesToRead;
		this.fileRead = "";
	}
	
	private void filterSpaces() {
		String wordSeparator = "\s\s+";
		String[] result;
		Pattern pattern = Pattern.compile(wordSeparator);
		result = pattern.split(fileRead);
		this.mergeTokens(result);
	}
	private void mergeTokens(String[] tokens) {
		this.fileRead = "";
		for(String str : tokens) {
				fileRead += str;
		}
	}
		
	@Override
	public String readFile( String fileName ) throws IOException {
		
		FileInputStream inFile = new FileInputStream( fileName );
		
		while(bytesRead == numberBytesToRead) { 

			
			bytesAvailable = inFile.available();
			if( bytesAvailable > numberBytesToRead ) 
				bytesAvailable = numberBytesToRead;
			int offsetByteToRead = 0;
			byte[] buffer = new byte [numberBytesToRead];
			bytesRead = inFile.read( buffer, offsetByteToRead, bytesAvailable );

			fileRead += new String( buffer, "UTF-8" );
		}
		inFile.close();
		this.filterSpaces();
		return fileRead;
	}
}
