package by.jwd.clientserver.entity;

public class PunctuationMark implements StringContent, java.io.Serializable{

	private char punctuationMark;
	private static final long serialVersionUID = 1L;
	
	public PunctuationMark() {}
	public PunctuationMark(String punctuationMark) {
		this.punctuationMark = punctuationMark.charAt(0);
	}
	
	
	public char getPunctuationMark() {
		return this.punctuationMark;
	}
	public void setPunctuationMark(char punctuationMark) {
		this.punctuationMark = punctuationMark;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.punctuationMark;
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
		PunctuationMark other = (PunctuationMark) obj;
		if (this.punctuationMark != other.punctuationMark)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return this.getClass().getName() + "@"
				+ "punctuationMark: " + this.punctuationMark;
	}
	
	
	@Override
	public String getContent() {
		return "" + this.punctuationMark;
	}
	
}
