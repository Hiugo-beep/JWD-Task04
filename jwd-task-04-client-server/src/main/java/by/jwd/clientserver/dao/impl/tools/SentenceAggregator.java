package by.jwd.clientserver.dao.impl.tools;

import java.util.List;

import by.jwd.clientserver.entity.Sentence;

public interface SentenceAggregator {

	public String setSentenceString(List<Sentence> sentence, int sentenceExceptionNumber);
}
