package by.jwd.clientserver.entity;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements TextContent, java.io.Serializable{

	private List<StringContent> sentenceContent = null;
	public static long serialVersionUID = 1L;
	
	public Sentence() {
		this.sentenceContent = new ArrayList<StringContent>();
	}

	public void setSentenceContent(List<StringContent> sentenceContent) {
		this.sentenceContent = sentenceContent;
	}
	public List<StringContent> getSentenceContent(){
		return this.sentenceContent;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.sentenceContent == null) ? 0 : sentenceContent.hashCode());
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
		Sentence other = (Sentence) obj;
		if (this.sentenceContent == null) {
			if (other.sentenceContent != null)
				return false;
		} else if (!this.sentenceContent.equals(other.sentenceContent))
			return false;
		return true;
	}
	@Override
	public String toString() {
		String content = "";
		content += this.getClass().getName() + "@Sentence: ";
		for(StringContent str: this.sentenceContent)
			content += str.getContent() + "\n";
		return content;
	}
	
	
	@Override
	public String getContent() {
		String contentSentence = "";
		for(StringContent str: this.sentenceContent) {
			contentSentence += str.getContent() + " ";
		}
		contentSentence += "\n";
		return contentSentence;
	}
	@Override
	public void add(StringContent element) {
		this.sentenceContent.add(element);
	}
}
