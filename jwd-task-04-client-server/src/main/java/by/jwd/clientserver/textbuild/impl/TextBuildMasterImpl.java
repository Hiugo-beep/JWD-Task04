package by.jwd.clientserver.textbuild.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.jwd.clientserver.entity.Text;
import by.jwd.clientserver.textbuild.TextBuild;
import by.jwd.clientserver.textbuild.TextBuildMaster;

public class TextBuildMasterImpl implements TextBuildMaster {

	private static final TextBuildMasterImpl instance = new TextBuildMasterImpl();
	private TextBuildMasterImpl() {	}
	
	public static TextBuildMasterImpl getInstance() {
		return instance;
	}
	public Text createText(String[] file)  {

		
		TextBuild build = TextBuildImpl.getInstance();
		boolean isValid = false;
		List<String> sentences = new ArrayList<String>();
		for(String str:file) {
			isValid = str != "";
			if(isValid) {
				sentences.add(str);
			}
		}
		ListIterator<String> sentenceIter = sentences.listIterator();
		
		String codeBlockSeparator = "[А-я]+";
		Pattern pattern = Pattern.compile(codeBlockSeparator);
		Matcher resultMatcher;
		boolean isSentence = false;
		Pattern wordPattern = Pattern.compile("\s+");
		
		while(sentenceIter.hasNext()) {
			String tempStr = sentenceIter.next();
			resultMatcher = pattern.matcher(tempStr);
			isSentence = resultMatcher.find();
			if(!isSentence) {
				build.setCodeBlock(tempStr);
			}
			else {
				build.setSentence(wordPattern.split(tempStr));
			}
		}
		return build.getText();
	}
}
