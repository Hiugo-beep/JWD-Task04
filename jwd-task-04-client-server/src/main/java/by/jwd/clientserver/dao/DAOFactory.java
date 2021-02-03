package by.jwd.clientserver.dao;

import by.jwd.clientserver.dao.impl.*;

public class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final ParserDAO parserDAO = new ParserDAOImpl();
	private final TaskDAO task01DAO = new Task01DAOImpl();
	private final TaskDAO task02DAO = new Task02DAOImpl();
	private final TaskDAO task03DAO = new Task03DAOImpl();
	private final TaskDAO task04DAO = new Task04DAOImpl();
	private final TaskDAO task05DAO = new Task05DAOImpl();
	private final TaskDAO task06DAO = new Task06DAOImpl();
	private final TaskDAO task07DAO = new Task07DAOImpl();
	private final TaskDAO task08DAO = new Task08DAOImpl();
	private final TaskDAO task09DAO = new Task09DAOImpl();
	private final TaskDAO task10DAO = new Task10DAOImpl();
	private final TaskDAO task11DAO = new Task11DAOImpl();
	private final TaskDAO task12DAO = new Task12DAOImpl();
	private final TaskDAO task13DAO = new Task13DAOImpl();
	private final TaskDAO task14DAO = new Task14DAOImpl();
	private final TaskDAO task15DAO = new Task15DAOImpl();
	private final TaskDAO task16DAO = new Task16DAOImpl();
	
	
	private DAOFactory() {}
	
	public ParserDAO getParserDAO() {
		return parserDAO;
	}
	public TaskDAO getTask01DAO() {
		return task01DAO;
	}
	public TaskDAO getTask02DAO() {
		return task02DAO;
	}
	public TaskDAO getTask03DAO() {
		return task03DAO;
	}
	public TaskDAO getTask04DAO() {
		return task04DAO;
	}
	public TaskDAO getTask05DAO() {
		return task05DAO;
	}
	public TaskDAO getTask06DAO() {
		return task06DAO;
	}
	public TaskDAO getTask07DAO() {
		return task07DAO;
	}
	public TaskDAO getTask08DAO() {
		return task08DAO;
	}
	public TaskDAO getTask09DAO() {
		return task09DAO;
	}
	public TaskDAO getTask10DAO() {
		return task10DAO;
	}
	public TaskDAO getTask11DAO() {
		return task11DAO;
	}
	public TaskDAO getTask12DAO() {
		return task12DAO;
	}
	public TaskDAO getTask13DAO() {
		return task13DAO;
	}
	public TaskDAO getTask14DAO() {
		return task14DAO;
	}
	public TaskDAO getTask15DAO() {
		return task15DAO;
	}
	public TaskDAO getTask16DAO() {
		return task16DAO;
	}
	public static DAOFactory getInstance() {
		return instance;
	}
}
