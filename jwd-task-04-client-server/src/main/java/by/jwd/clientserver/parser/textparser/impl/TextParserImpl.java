package by.jwd.clientserver.parser.textparser.impl;

import java.util.regex.Pattern;

import by.jwd.clientserver.entity.Text;
import by.jwd.clientserver.parser.textparser.TextParser;
import by.jwd.clientserver.textbuild.TextBuildMaster;
import by.jwd.clientserver.textbuild.impl.TextBuildMasterImpl;

public class TextParserImpl implements TextParser{

	@Override
	public Text createText(String fileRead) {
		Text text = null;
	
		String sentenceSeparator = "\t+|\f+|\r+|\n+";
		String[] result;
		Pattern pattern = Pattern.compile(sentenceSeparator);
		result = pattern.split(fileRead);
		
		TextBuildMaster buildMaster = TextBuildMasterImpl.getInstance();
		text = buildMaster.createText(result);
		return text;
	}
}
