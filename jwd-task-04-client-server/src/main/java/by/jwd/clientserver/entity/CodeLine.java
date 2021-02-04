package by.jwd.clientserver.entity;

public class CodeLine implements StringContent, java.io.Serializable{
	
	private String codeLine = "";
	private static final long serialVersionUID = 1L;
	
	public CodeLine() {}
	public CodeLine(String codeLine) {
		this.codeLine= codeLine;
	}
	
	public void  setCodeLine(String content) {
		this.codeLine = content;
	}
	public String getCodeLine() {
		return this.codeLine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.codeLine == null) ? 0 : this.codeLine.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodeLine other = (CodeLine) obj;
		if (this.codeLine == null) {
			if (other.codeLine != null)
				return false;
		} else if (!this.codeLine.equals(other.codeLine))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + "@"
				+ "codeLine: " + this.codeLine;
	}
	
	@Override 	
	public String getContent() {
		return this.codeLine;
	}
}
