package by.jwd.clientserver.service;

import by.jwd.clientserver.entity.Text;
import by.jwd.clientserver.service.impl.ParserServiceImpl;
import by.jwd.clientserver.service.impl.TaskServiceImpl;


public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final TaskService taskService = new TaskServiceImpl();
	
	private final ParserService parserService = new ParserServiceImpl();
	
	private ServiceFactory() {}

	public TaskService getTaskService() {
		return taskService;
	}

	public ParserService getParserService() {
		return parserService;
	}
	public static ServiceFactory getInstance() {
		return instance;
	}
}