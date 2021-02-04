package by.jwd.clientserver.dao.impl.tools.impl;

import java.util.ArrayList;
import java.util.List;

import by.jwd.clientserver.dao.impl.tools.TaskPerforming;
import by.jwd.clientserver.entity.Sentence;
import by.jwd.clientserver.entity.StringContent;
import by.jwd.clientserver.entity.Word;

public class Task02PerformingImpl implements TaskPerforming{

	
	private int countWords(Sentence sent) {
		
		int counter = 0;
		for(StringContent word : sent.getSentenceContent()) {
			boolean isWord = word.getClass() == Word.class;
			if(isWord) {
				counter++;
			}
		}
		return counter;
	}
	
	@Override
	public List<String> doTask(List<Sentence> sentence) {
		
		List<String> answer = new ArrayList<String>();
		int sentenceStartSize = sentence.size();
		
		for(int i=0;i<sentenceStartSize;i++) {
			
			int temp = 0;
			int numberSentence = 0;
			for(int j = 0;j<sentence.size();j++) {
				Sentence sent = sentence.get(j);
				int sentCount = countWords(sent);
				if(temp < sentCount) {
					temp = sentCount;
					numberSentence = j;
				}
			}
			answer.add(sentence.get(numberSentence).getContent());
			sentence.remove(numberSentence);
			
		}
		
		//answer.add(Integer.toString(counter) + " sentences in the text have repeated words");
	
		return answer;
	}


}
