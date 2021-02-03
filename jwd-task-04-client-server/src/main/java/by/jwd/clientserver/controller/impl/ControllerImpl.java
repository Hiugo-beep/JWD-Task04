package by.jwd.clientserver.controller.impl;

import java.util.List;

import by.jwd.clientserver.controller.Controller;
import by.jwd.clientserver.entity.Text;
import by.jwd.clientserver.parser.requestparser.RequestParser;
import by.jwd.clientserver.parser.requestparser.impl.RequestParserImpl;
import  by.jwd.clientserver.service.TaskService;
import by.jwd.clientserver.service.ParserService;
import  by.jwd.clientserver.service.ServiceFactory;

public class ControllerImpl implements Controller {
	private String serverFile = "resources/programmingTutorial.txt";
	public Text doTask(String request) {
		Text parseText = null;
		ServiceFactory factory = ServiceFactory.getInstance();
		
		Text fileText = null; 
		ParserService parserText = factory.getParserService();
		fileText = parserText.parseServerFile(serverFile);
		
		boolean isValidFileText = fileText != null;
		if(isValidFileText) {
			
			RequestParser parser = new RequestParserImpl();
			List<String> requestList = parser.getRequest(request);
			boolean isValidParser = true;
			TaskService taskCompleting = factory.getTaskService();

			if(isValidParser) {
				parseText = taskCompleting.doTask(fileText, requestList);
			}
		}
		return parseText;
	}

}
