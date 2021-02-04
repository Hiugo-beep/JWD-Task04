package by.jwd.clientserver.dao;

import by.jwd.clientserver.dao.impl.*;

public class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final ParserDAO parserDAO = new ParserDAOImpl();
	private final TaskDAO taskDAO = new TaskDAOImpl();
	
	
	private DAOFactory() {}
	
	public ParserDAO getParserDAO() {
		return parserDAO;
	}
	public TaskDAO getTaskDAO() {
		return taskDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}
}
