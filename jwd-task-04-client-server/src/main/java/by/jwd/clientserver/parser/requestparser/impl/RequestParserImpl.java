package by.jwd.clientserver.parser.requestparser.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import by.jwd.clientserver.parser.requestparser.RequestParser;

public class RequestParserImpl implements RequestParser {

	private List<String> request = null;
	
	public RequestParserImpl() {
		request = new ArrayList<String>();
	}
	
	@Override
	public List<String> getRequest(String requestFromClient){
		
		String argumentSeparator = "\\)";
		Pattern pattern = Pattern.compile(argumentSeparator);
		String[] result = pattern.split(requestFromClient);
		request.add(result[0]);
		
		argumentSeparator = ",";
		pattern = Pattern.compile(argumentSeparator);
		boolean hasParameters  = result.length > 1;
		if(hasParameters) {
			
			result = pattern.split(result[1]);
			for(String str: result) {
				request.add(str);
			}
		}
		
		return request;
	}
}
