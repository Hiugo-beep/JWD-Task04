package by.jwd.clientserver.service;

import java.util.List;

import by.jwd.clientserver.entity.Text;

public interface TaskService {
	public Text doTask(Text fileText, List<String> parametrs);
}
