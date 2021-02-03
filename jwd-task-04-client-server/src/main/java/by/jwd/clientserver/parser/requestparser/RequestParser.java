package by.jwd.clientserver.parser.requestparser;

import java.util.List;

public interface RequestParser {
	public List<String> getRequest(String requestFromClient);
}
