package by.jwd.clientserver.dao.impl.tools.impl;

import java.util.ArrayList;
import java.util.List;

import by.jwd.clientserver.dao.impl.tools.TaskPerforming;
import by.jwd.clientserver.entity.Sentence;

public class Task05PerformingImpl implements TaskPerforming{

	@Override
	public List<String> doTask(List<Sentence> sentence) {
		
		List<String> lastWord = new ArrayList<String>();

		
		List<String> answer = new ArrayList<String>();
		//answer.add(Integer.toString(counter) + " sentences in the text have repeated words");
	
		return answer;
	}

}
