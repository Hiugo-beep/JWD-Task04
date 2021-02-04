package by.jwd.clientserver.textbuild.impl;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.jwd.clientserver.entity.CodeBlock;
import by.jwd.clientserver.entity.CodeLine;
import by.jwd.clientserver.entity.PunctuationMark;
import by.jwd.clientserver.entity.Sentence;
import by.jwd.clientserver.entity.Text;
import by.jwd.clientserver.entity.Word;
import by.jwd.clientserver.parser.markparser.PunctuationMarkParser;
import by.jwd.clientserver.parser.markparser.impl.PunctuationMarkParserImpl;
import by.jwd.clientserver.textbuild.TextBuild;

public class TextBuildImpl implements TextBuild{

	private PunctuationMarkParser parser = null;
	private Text text = null;
	private boolean isSentenceLast = false;
	private boolean isStart = true;
	
	public TextBuildImpl() {
		text = new Text();
		parser = new PunctuationMarkParserImpl();
	}
	

	public Text getText() {
		return text;
	}
	public void setSentence(String[] sentences) {
		isStart = false;
		text.getContent().add(new Sentence());
		int lastIndex = text.getContent().size() -1;
	
		Pattern patternPunctuationMark = Pattern.compile("[\\.,!\"'?:;*]+");
		Matcher resultMatcher = null;
		boolean isPunctuationMark = false;
		for(String sentence: sentences) {
			resultMatcher = patternPunctuationMark.matcher(sentence);
			isPunctuationMark = resultMatcher.find();
			if(isPunctuationMark) {
				List<String> sentenceMark = parser.parse(sentence);
				boolean isSymbol = false;
				for(String str: sentenceMark) {
					resultMatcher = patternPunctuationMark.matcher(str);
					isSymbol = resultMatcher.find();
					if(isSymbol) {
						text.getContent().get(lastIndex).add(new PunctuationMark(str));
					}
					else {
						text.getContent().get(lastIndex).add(new Word(str));
					}
				}
			}
			else
			{
				text.getContent().get(lastIndex).add(new Word(sentence));
			}
		}
		isSentenceLast = true;
	}
	
	public void setCodeBlock(String codeLine) {
		if(isStart) {
			text.getContent().add(new CodeBlock());
			isStart = false;
		}
		else if(isSentenceLast) {
			text.getContent().add(new CodeBlock());
		}
		
		int lastIndex = text.getContent().size() -1;
		text.getContent().get(lastIndex).add(new CodeLine(codeLine));
		isSentenceLast = false;
	}

}


