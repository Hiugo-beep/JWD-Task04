package by.jwd.clientserver.service.impl;

import by.jwd.clientserver.dao.DAOFactory;
import by.jwd.clientserver.dao.ParserDAO;
import by.jwd.clientserver.entity.Text;
import by.jwd.clientserver.service.ParserService;


public class ParserServiceImpl implements ParserService{

	@Override
	public Text parseServerFile(String fileName) {
		DAOFactory factory = DAOFactory.getInstance();
		ParserDAO parserDAO = factory.getParserDAO();
		
		Text text = parserDAO.parse(fileName);
		return text;	
	}
}
