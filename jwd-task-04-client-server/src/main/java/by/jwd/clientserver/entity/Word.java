package by.jwd.clientserver.entity;

public class Word implements StringContent, java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String wordContent = "";
	
	public Word() {}
	public Word(String word) {
		this.wordContent = word;
	}
	
	public void setWordContent(String word) {
		this.wordContent = word;
	}
	public String getWordContent() {
		return this.wordContent;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.wordContent == null) ? 0 : wordContent.hashCode());
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
		Word other = (Word) obj;
		if (this.wordContent == null) {
			if (other.wordContent != null)
				return false;
		} else if (!this.wordContent.equals(other.wordContent))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return this.getClass().getName() + "@"
				+ "codeLine: " + this.wordContent;
	}
	
	@Override
	public String getContent() {
		return "" + this.wordContent;
	}
}
