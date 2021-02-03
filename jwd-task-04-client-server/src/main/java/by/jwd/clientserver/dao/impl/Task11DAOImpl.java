package by.jwd.clientserver.dao.impl;

import java.util.List;

import by.jwd.clientserver.dao.TaskDAO;
import by.jwd.clientserver.entity.Text;

public class Task11DAOImpl implements TaskDAO{

	@Override
	public Text parse(Text fileText, List<String> parametrs) {
		return fileText;
	}

}
