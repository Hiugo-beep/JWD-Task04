package by.jwd.clientserver.dao.impl;

import java.io.IOException;

import by.jwd.clientserver.dao.ParserDAO;
import by.jwd.clientserver.entity.Text;
import by.jwd.clientserver.parser.textparser.TextParser;
import by.jwd.clientserver.parser.textparser.impl.TextParserImpl;
import by.jwd.clientserver.reader.ParserReader;
import by.jwd.clientserver.reader.impl.ParserReaderImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParserDAOImpl implements ParserDAO{
	private static final Logger logger = LoggerFactory.getLogger(ParserDAOImpl.class);
	@Override
	public Text parse(String fileName) {
		ParserReader reader = new ParserReaderImpl();
		String fileRead = "";
		logger.debug("parse");
		try { 
			fileRead = reader.readFile(fileName);
		}
		catch (IOException ex) {
			logger.error("IOException error", ex);
		}

		Text text = null;
		TextParser parser = new TextParserImpl(); 
		text = parser.createText(fileRead);
		return text;
	}
}
