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
		TaskDAO taskDAO = factory.getTaskDAO();
		
		parseText = taskDAO.parse(fileText, parametrs);
		
		return parseText;
	}
}
