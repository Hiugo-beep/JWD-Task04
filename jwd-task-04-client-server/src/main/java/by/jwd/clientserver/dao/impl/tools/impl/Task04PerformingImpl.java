package by.jwd.clientserver.dao.impl.tools.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.jwd.clientserver.dao.impl.tools.SentenceAggregator;
import by.jwd.clientserver.dao.impl.tools.TaskPerforming;
import by.jwd.clientserver.entity.PunctuationMark;
import by.jwd.clientserver.entity.Sentence;
import by.jwd.clientserver.entity.StringContent;
import by.jwd.clientserver.entity.Word;

public class Task04PerformingImpl implements TaskPerforming{

	private List<String> parametrs = null;
	
	@Override
	public List<String> doTask(List<Sentence> sentence) {
		
		List<String> answer = new ArrayList<String>();
		int sizeParametr = Integer.parseInt(parametrs.get(0));
		
		for(Sentence sent: sentence) {
			int index = sent.getSentenceContent().size()-1;
			boolean isInterrogativeSentence = sent.getSentenceContent().get(index).equals(new PunctuationMark("?"));
			if(isInterrogativeSentence) {
				for(StringContent word:sent.getSentenceContent() ) {
					boolean isWord = word.getClass() == Word.class;
					if(isWord) {
						boolean sizeEqual = sizeParametr == word.getContent().length();
						if(sizeEqual) {
							answer.add(word.getContent() + ", ");
						}
					}
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
