package by.jwd.clientserver.dao.impl.tools;

import by.jwd.clientserver.dao.impl.tools.impl.Task01PerformingImpl;
import by.jwd.clientserver.dao.impl.tools.impl.Task02PerformingImpl;
import by.jwd.clientserver.dao.impl.tools.impl.Task03PerformingImpl;
import by.jwd.clientserver.dao.impl.tools.impl.Task04PerformingImpl;
import by.jwd.clientserver.dao.impl.tools.impl.Task05PerformingImpl;
import by.jwd.clientserver.dao.impl.tools.impl.Task06PerformingImpl;
import by.jwd.clientserver.dao.impl.tools.impl.Task07PerformingImpl;
import by.jwd.clientserver.dao.impl.tools.impl.Task08PerformingImpl;
import by.jwd.clientserver.dao.impl.tools.impl.Task09PerformingImpl;
import by.jwd.clientserver.dao.impl.tools.impl.Task10PerformingImpl;
import by.jwd.clientserver.dao.impl.tools.impl.Task11PerformingImpl;
import by.jwd.clientserver.dao.impl.tools.impl.Task12PerformingImpl;
import by.jwd.clientserver.dao.impl.tools.impl.Task13PerformingImpl;
import by.jwd.clientserver.dao.impl.tools.impl.Task14PerformingImpl;
import by.jwd.clientserver.dao.impl.tools.impl.Task15PerformingImpl;
import by.jwd.clientserver.dao.impl.tools.impl.Task16PerformingImpl;

public class TaskPerformingFactory {

	private static final TaskPerformingFactory instance = new TaskPerformingFactory();

	private final TaskPerforming taskPerforming01 = new Task01PerformingImpl();
	private final TaskPerforming taskPerforming02 = new Task02PerformingImpl();
	private final TaskPerforming taskPerforming03 = new Task03PerformingImpl();
	private final TaskPerforming taskPerforming04 = new Task04PerformingImpl();
	private final TaskPerforming taskPerforming05 = new Task05PerformingImpl();
	private final TaskPerforming taskPerforming06 = new Task06PerformingImpl();
	private final TaskPerforming taskPerforming07 = new Task07PerformingImpl();
	private final TaskPerforming taskPerforming08 = new Task08PerformingImpl();
	private final TaskPerforming taskPerforming09 = new Task09PerformingImpl();
	private final TaskPerforming taskPerforming10 = new Task10PerformingImpl();
	private final TaskPerforming taskPerforming11 = new Task11PerformingImpl();
	private final TaskPerforming taskPerforming12 = new Task12PerformingImpl();
	private final TaskPerforming taskPerforming13 = new Task13PerformingImpl();
	private final TaskPerforming taskPerforming14 = new Task14PerformingImpl();
	private final TaskPerforming taskPerforming15 = new Task15PerformingImpl();
	private final TaskPerforming taskPerforming16 = new Task16PerformingImpl();
	
	private TaskPerformingFactory() {}

	public TaskPerforming getTask01Performing() {
		return taskPerforming01;
	}
	public TaskPerforming getTask02Performing() {
		return taskPerforming02;
	}
	public TaskPerforming getTask03Performing() {
		return taskPerforming03;
	}
	public TaskPerforming getTask04Performing() {
		return taskPerforming04;
	}
	public TaskPerforming getTask05Performing() {
		return taskPerforming05;
	}
	public TaskPerforming getTask06Performing() {
		return taskPerforming06;
	}
	
	public TaskPerforming getTask07Performing() {
		return taskPerforming07;
	}
	public TaskPerforming getTask08Performing() {
		return taskPerforming08;
	}
	public TaskPerforming getTask09Performing() {
		return taskPerforming09;
	}
	public TaskPerforming getTask10Performing() {
		return taskPerforming10;
	}
	public TaskPerforming getTask11Performing() {
		return taskPerforming11;
	}
	public TaskPerforming getTask12Performing() {
		return taskPerforming12;
	}
	public TaskPerforming getTask13Performing() {
		return taskPerforming13;
	}
	
	public TaskPerforming getTask14Performing() {
		return taskPerforming14;
	}
	public TaskPerforming getTask15Performing() {
		return taskPerforming15;
	}
	public TaskPerforming getTask16Performing() {
		return taskPerforming16;
	}
	public static TaskPerformingFactory getInstance() {
		return instance;
	}
}
