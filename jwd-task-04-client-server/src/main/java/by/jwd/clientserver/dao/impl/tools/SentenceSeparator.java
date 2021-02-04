package by.jwd.clientserver.dao.impl.tools;

import java.util.List;

import by.jwd.clientserver.entity.Sentence;
import by.jwd.clientserver.entity.Text;

public interface SentenceSeparator {
	public List<Sentence> createSentenceList(Text text);
}
