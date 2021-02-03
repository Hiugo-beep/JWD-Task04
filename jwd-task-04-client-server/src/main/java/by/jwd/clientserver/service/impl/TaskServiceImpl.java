package by.jwd.clientserver.service.impl;

import by.jwd.clientserver.service.TaskService;

import java.util.List;

import by.jwd.clientserver.dao.DAOFactory;
import by.jwd.clientserver.dao.TaskDAO;
import by.jwd.clientserver.entity.Text;

public class TaskServiceImpl implements TaskService {
	private List<String> parametrs;
	@Override
	public Text doTask(Text fileText, List<String> parametrs) {

		Text parseText = null;
		
		DAOFactory factory = DAOFactory.getInstance();
		TaskDAO taskDAO = null;
		boolean isValidTaskDAO = true;
		switch(parametrs.get(0)) {
		case "1":{
			taskDAO = factory.getTask01DAO();
			break;
		}
		case "2":{
			taskDAO = factory.getTask02DAO();
			break;
		}
		case "3":{
			taskDAO = factory.getTask03DAO();
			break;
		}
		case "4":{
			taskDAO = factory.getTask04DAO();
			break;
		}
		case "5":{
			taskDAO = factory.getTask05DAO();
			break;
		}
		case "6":{
			taskDAO = factory.getTask06DAO();
			break;
		}
		case "7":{
			taskDAO = factory.getTask07DAO();
			break;
		}
		case "8":{
			taskDAO = factory.getTask08DAO();
			break;
		}
		case "9":{
			taskDAO = factory.getTask09DAO();
			break;
		}
		case "10":{
			taskDAO = factory.getTask10DAO();
			break;
		}
		case "11":{
			taskDAO = factory.getTask11DAO();
			break;
		}
		case "12":{
			taskDAO = factory.getTask12DAO();
			break;
		}
		case "13":{
			taskDAO = factory.getTask13DAO();
			break;
		}
		case "14":{
			taskDAO = factory.getTask14DAO();
			break;
		}
		case "15":{
			taskDAO = factory.getTask15DAO();
			break;
		}
		case "16":{
			taskDAO = factory.getTask16DAO();
			break;
		}
		default:{
			isValidTaskDAO = false;
		}
		}
		if(isValidTaskDAO) {
			parametrs.remove(0);
			parseText = taskDAO.parse(fileText, parametrs);
		}
		
		
		return parseText;
	}
}
