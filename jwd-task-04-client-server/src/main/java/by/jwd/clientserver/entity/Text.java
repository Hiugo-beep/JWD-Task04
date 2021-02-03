package by.jwd.clientserver.entity;

import java.util.ArrayList;
import java.util.List;

public class Text implements java.io.Serializable{

	private List<TextContent> content = null;
	private List<String> textAnswer = null;
	private String taskCondition = "";
	public static long serialVersionUID = 1L;
	
	public Text() {
		this.content = new ArrayList<TextContent>();
		this.textAnswer = new ArrayList<String>();
	}
	
	public void setContent(List<TextContent> text) {
		this.content = text;
	}
	public List<TextContent> getContent() {
		return this.content;
	}

	public void setTextAnswer(List<String> textAnswer) {
		this.textAnswer = textAnswer;
	}
	public List<String> getTextAnswer() {
		return this.textAnswer;
	}
	
	public void setTaskCondition(String taskCondition) {
		this.taskCondition = taskCondition;
	}
	public String getTaskCondition() {
		return this.taskCondition;
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.content == null) ? 0 : this.content.hashCode());
		result = prime * result + ((this.taskCondition == null) ? 0 : this.taskCondition.hashCode());
		result = prime * result + ((this.textAnswer == null) ? 0 : this.textAnswer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!this.content.equals(other.content))
			return false;
		if (this.taskCondition == null) {
			if (other.taskCondition != null)
				return false;
		} else if (!this.taskCondition.equals(other.taskCondition))
			return false;
		if (this.textAnswer == null) {
			if (other.textAnswer != null)
				return false;
		} else if (!this.textAnswer.equals(other.textAnswer))
			return false;
		return true;
	}
		
	@Override
	public String toString() {
		String textContent ="";
		textContent += "\nTaskCondition:" + taskCondition + "\n\nContent:\n";
		for(TextContent str: this.content) {
			textContent += str.getContent();
		}
		textContent += "\nAnswer:\n";
		for(String str: this.textAnswer) {
			textContent += str;
		}
		
		return textContent;
	}
}
