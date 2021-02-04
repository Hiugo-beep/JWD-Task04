package by.jwd.clientserver.dao.impl;

import java.util.List;

import by.jwd.clientserver.dao.TaskDAO;
import by.jwd.clientserver.dao.impl.tools.SentenceSeparator;
import by.jwd.clientserver.dao.impl.tools.TaskPerforming;
import by.jwd.clientserver.dao.impl.tools.impl.SentenceSeparatorImpl;
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
import by.jwd.clientserver.entity.Sentence;
import by.jwd.clientserver.entity.Text;

public class TaskDAOImpl implements TaskDAO{
	private List<String> answer = null;
	private String taskCondition = "";
	@Override
	public Text parse(Text fileText, List<String> parametrs) {
		
		
		SentenceSeparator separator = new SentenceSeparatorImpl();
		List<Sentence> sentence = separator.createSentenceList(fileText);
				
		TaskPerforming taskPerforming = null;
		
		boolean isValidTaskPerforming = true;
		
		switch(parametrs.get(0)) {
		case "1":{
			taskPerforming = new Task01PerformingImpl();
			taskCondition = "Find the largest number of sentences in the text that contain the same words.";
			break;
		}
		case "2":{
			taskCondition = "Print all the sentences of the given text in ascending order of the number of words in each of them.";
			taskPerforming = new Task02PerformingImpl();
			break;
		}
		case "3":{
			taskCondition = "Find a word in the first sentence that does not exist in any of the other sentences.";
			taskPerforming = new Task03PerformingImpl();
			break;
		}
		case "4":{
			
			taskCondition = "In all the interrogative sentences of the text, find and print the words of the specified length without repetition.";
			taskPerforming = new Task04PerformingImpl();
			break;
		}
		case "5":{
			taskCondition = "In each sentence of the text, swap the first word with the last, without changing the length of the sentence.";
			taskPerforming = new Task05PerformingImpl();
			break;
		}
		case "6":{
			taskCondition = "Print the words of the text in alphabetical order by the first letter. Words starting with a new letter should be printed from the red line.";
			taskPerforming =new Task06PerformingImpl();
			break;
		}
		case "7":{
			taskCondition = "Sort the words of the text by increasing the proportion of vowel letters (the ratio of the number of vowels to the total number of letters in the word).";
			taskPerforming = new Task07PerformingImpl();
			break;
		}
		case "8":{
			taskCondition = "The words of the text beginning with vowels should be sorted alphabetically by the first consonant letter of the word.";
			taskPerforming = new Task08PerformingImpl();
			break;
		}
		case "9":{
			taskCondition = "Sort all the words of the text in ascending order of the number of the specified letter in the word. Words with the same number of letters are arranged in alphabetical order.";
			taskPerforming = new Task09PerformingImpl();
			break;
		}
		case "10":{
			taskCondition = "There is a text and a list of words. For each word from the given list, find how many times it occurs in each sentence, and sort the words in descending order of the total number of occurrences.";
			taskPerforming = new Task10PerformingImpl();
			break;
		}
		case "11":{
			taskCondition = "In each sentence of the text, exclude the substring of the maximum length starting and ending with the specified characters.";
			taskPerforming = new Task11PerformingImpl();
			break;
		}
		case "12":{
			taskCondition = "Remove all words of the specified length starting with a consonant letter from the text.";
			taskPerforming = new Task12PerformingImpl();
			break;
		}
		case "13":{
			taskCondition = "Sort the words in the text in descending order of the number of occurrences of the specified character, and in case of equality – alphabetically.";
			taskPerforming = new Task13PerformingImpl();
			break;
		}
		case "14":{
			taskCondition = "In the given text, find a substring of the maximum length that is a palindrome, i.e., read from left to right and from right to left in the same way.";
			taskPerforming = new Task14PerformingImpl();
			break;
		}
		case "15":{
			taskCondition = "Transform each word in the text by removing all subsequent (previous) occurrences of the first (last) letter of the word.";
			taskPerforming = new Task15PerformingImpl();
			break;
		}
		case "16":{
			taskCondition = "In some sentence of the text, replace the words of the specified length with the specified substring, the length of which may not coincide with the length of the word.";
			taskPerforming  = new Task16PerformingImpl();
			break;
		}
		default:{
			isValidTaskPerforming = false;
		}
		}
		
		if(isValidTaskPerforming) {
			parametrs.remove(0);
			answer = taskPerforming.doTask(sentence);
		}
		
		
		fileText.setTextAnswer(this.answer);
		fileText.setTaskCondition(taskCondition);
		return fileText;
	}
	

}
