package by.jwd.clientserver.dao.impl.tools.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.jwd.clientserver.dao.impl.tools.SentenceAggregator;
import by.jwd.clientserver.dao.impl.tools.TaskPerforming;
import by.jwd.clientserver.entity.Sentence;
import by.jwd.clientserver.entity.StringContent;

public class Task04PerformingImpl implements TaskPerforming{

	@Override
	public List<String> doTask(List<Sentence> sentence) {
		
		List<String> lastWord = new ArrayList<String>();

		
		List<String> answer = new ArrayList<String>();
		//answer.add(Integer.toString(counter) + " sentences in the text have repeated words");
	
		return answer;
	}

}
