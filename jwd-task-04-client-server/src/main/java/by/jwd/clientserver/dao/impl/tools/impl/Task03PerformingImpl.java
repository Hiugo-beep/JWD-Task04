package by.jwd.clientserver.dao.impl.tools.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.jwd.clientserver.dao.impl.tools.SentenceAggregator;
import by.jwd.clientserver.dao.impl.tools.TaskPerforming;
import by.jwd.clientserver.entity.Sentence;
import by.jwd.clientserver.entity.StringContent;

public class Task03PerformingImpl implements TaskPerforming{

	private List<String> parametrs = null;
	
	@Override
	public List<String> doTask(List<Sentence> sentence) {
		
		List<String> answer = new ArrayList<String>();
		answer.add("words from the first sentence that are not present in the others:\n");
		Pattern pattern = null;
		Matcher result = null;
		boolean hasWord = false;
		SentenceAggregator aggregator = new SentenceAggregatorImpl();
		
		List<String> lastWord = new ArrayList<String>();
		int startIndex = 0;

			Sentence sent = sentence.get(startIndex);
			
			String text = aggregator.setSentenceString(sentence, startIndex);
			
			for(StringContent word : sent.getSentenceContent()) {
				boolean isRepeatedWord = lastWord.contains(word.getContent());
				if(!isRepeatedWord ) {
					
					pattern = Pattern.compile(word.getContent());
					result = pattern.matcher(text);
					hasWord = result.find();
					if(!hasWord) {
						lastWord.add(word.getContent());
						answer.add(word.getContent());
						break;
						
					}
				}
			}
		
	
		return answer;
	}
	
	@Override
	public void setParametrs(List<String> parametrs) {
		this.parametrs = parametrs;
		
	}
	
}
