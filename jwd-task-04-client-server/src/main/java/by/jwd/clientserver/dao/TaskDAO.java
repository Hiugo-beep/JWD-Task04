package by.jwd.clientserver.dao;

import java.util.List;

import by.jwd.clientserver.entity.Text;

public interface TaskDAO {
		public Text parse(Text fileText, List<String> parametrs);
}
