package by.jwd.clientserver.parser.markparser.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.jwd.clientserver.parser.markparser.PunctuationMarkParser;

public class PunctuationMarkParserImpl implements PunctuationMarkParser{
	private List<String> parseText = null;
	private List<String> punctuationMark = null;
	private List<String> mark = null;
	public PunctuationMarkParserImpl() {
		punctuationMark = new ArrayList<String>();
		punctuationMark.add(",");
		punctuationMark.add(":");
		punctuationMark.add(";");
		punctuationMark.add("\\*");
		punctuationMark.add("!");
		punctuationMark.add("\\?");
		punctuationMark.add("\s-\s");
		punctuationMark.add("\"");
		punctuationMark.add("'");
		punctuationMark.add("\\.");
		
		
		mark = new ArrayList<String>();
		mark.add(",");
		mark.add(":");
		mark.add(";");
		mark.add("*");
		mark.add("!");
		mark.add("?");
		mark.add("-");
		mark.add("\"");
		mark.add("'");
		mark.add(".");
		
	}
	public List<String> parse(String str){
		parseText = new ArrayList<String>();
		Pattern patternMark = null;
		Matcher matcherMark = null;
		boolean hasMark = false;
		
		ListIterator<String> markIter = this.punctuationMark.listIterator(); 
		boolean isStart = true;
		while(markIter.hasNext()) {
			String[] result = null;
			String temp = markIter.next();
			patternMark = Pattern.compile(temp);
			matcherMark  = patternMark.matcher(str);
			hasMark = matcherMark.find();
			if(hasMark) {
				patternMark = Pattern.compile("[\\.,!\"'?:;*]+");
					result = patternMark.split(str);
					for(String strMark:result) {
						boolean isValid = strMark != "";
						if(!isValid) {
							if(mark.get(markIter.previousIndex()) != ".") {
							parseText.add(mark.get(markIter.previousIndex()));
							}
						}else {
							if(isStart) {
								parseText.add(strMark);
								parseText.add(mark.get(markIter.previousIndex()));
							}
						}
					}
					isStart = false;
					
				
			}
			
		}
		return parseText;
	}
}