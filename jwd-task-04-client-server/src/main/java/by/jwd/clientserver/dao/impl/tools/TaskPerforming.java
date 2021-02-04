package by.jwd.clientserver.dao.impl.tools;

import java.util.List;

import by.jwd.clientserver.entity.Sentence;

public interface TaskPerforming {
	public List<String> doTask(List<Sentence> sentence);
	public void setParametrs(List<String> parametrs);
}
