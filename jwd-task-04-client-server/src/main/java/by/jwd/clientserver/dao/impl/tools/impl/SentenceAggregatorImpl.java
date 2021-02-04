package by.jwd.clientserver.dao.impl.tools.impl;

import java.util.List;

import by.jwd.clientserver.dao.impl.tools.SentenceAggregator;
import by.jwd.clientserver.entity.Sentence;
import by.jwd.clientserver.entity.StringContent;
import by.jwd.clientserver.entity.Word;

public class SentenceAggregatorImpl implements SentenceAggregator{

	@Override
	public String setSentenceString(List<Sentence> sentence, int sentenceExceptionNumber) {
		String senteceContent = "";
		for(int i=0;i<sentence.size();i++) {
			Sentence sent = sentence.get(i);
			boolean isValidSentence = i != sentenceExceptionNumber;
			if(isValidSentence) {
				for(StringContent word : sent.getSentenceContent()) {
					boolean isWordClass = word.getClass() == Word.class;
					if(isWordClass) {
						senteceContent += word.getContent();
					}
				}
			}
		}
		return senteceContent;
	}

}
