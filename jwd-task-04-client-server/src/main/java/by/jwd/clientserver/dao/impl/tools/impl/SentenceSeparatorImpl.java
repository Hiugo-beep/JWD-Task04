package by.jwd.clientserver.dao.impl.tools.impl;

import java.util.ArrayList;
import java.util.List;

import by.jwd.clientserver.dao.impl.tools.SentenceSeparator;
import by.jwd.clientserver.entity.Sentence;
import by.jwd.clientserver.entity.Text;

public class SentenceSeparatorImpl implements SentenceSeparator{

	
	@Override
	public List<Sentence> createSentenceList(Text text){
		
		List<Sentence> sentence = new ArrayList<Sentence>();
		for(int i=0;i<text.getContent().size();i++) {
			if(text.getContent().get(i).getClass()  == Sentence.class) {
				sentence.add((Sentence)text.getContent().get(i));
			}
		}
		
		return sentence;
	}
}
