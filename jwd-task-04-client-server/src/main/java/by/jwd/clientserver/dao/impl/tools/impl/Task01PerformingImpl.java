package by.jwd.clientserver.dao.impl.tools.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.jwd.clientserver.dao.impl.tools.SentenceAggregator;
import by.jwd.clientserver.dao.impl.tools.TaskPerforming;
import by.jwd.clientserver.entity.Sentence;
import by.jwd.clientserver.entity.StringContent;

public class Task01PerformingImpl implements TaskPerforming{

	
	@Override
	public List<String> doTask(List<Sentence> sentence) {
		Pattern pattern = null;
		Matcher result = null;
		boolean hasWord = false;
		SentenceAggregator aggregator = new SentenceAggregatorImpl();
		
		int counter = 0;
		List<String> lastWord = new ArrayList<String>();
		
		for(int i=0;i<sentence.size();i++) {
			Sentence sent = sentence.get(i);
			
			String text = aggregator.setSentenceString(sentence, i);
			
			for(StringContent word : sent.getSentenceContent()) {
				boolean isRepeatedWord = lastWord.contains(word.getContent());
				if(!isRepeatedWord ) {
					
					pattern = Pattern.compile(word.getContent());
					result = pattern.matcher(text);
					hasWord = result.find();
					if(hasWord) {
						counter++;
						lastWord.add(word.getContent());
						break;
						
					}
				}
			}
		}
		
		List<String> answer = new ArrayList<String>();
		answer.add(Integer.toString(counter) + " sentences in the text have repeated words");
	
		return answer;
	}

}
