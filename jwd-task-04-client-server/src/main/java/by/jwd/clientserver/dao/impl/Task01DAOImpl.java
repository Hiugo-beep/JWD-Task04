package by.jwd.clientserver.dao.impl;

import java.util.List;

import by.jwd.clientserver.dao.TaskDAO;
import by.jwd.clientserver.entity.Text;

public class Task01DAOImpl implements TaskDAO{
	private List<String> answer = null;
	private String taskCondition = "Find the largest number of sentences in the text that contain the same words.";
	@Override
	public Text parse(Text fileText, List<String> parametrs) {
		fileText.setTaskCondition(taskCondition);
		
		int counter = 0;
		for(int i=0;i<fileText.getContent().size();i++)
		System.out.println("Task01DAOImpl " + fileText.getContent().get(i).getClass());
		return fileText;
	}
}
