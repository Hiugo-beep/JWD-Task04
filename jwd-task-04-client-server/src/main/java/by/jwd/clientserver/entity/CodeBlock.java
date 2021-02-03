package by.jwd.clientserver.entity;

import java.util.ArrayList;
import java.util.List;

public class CodeBlock implements TextContent, java.io.Serializable{

	private List<StringContent> codeLine = null;
	public static long serialVersionUID = 1L;
	
	public CodeBlock() {
		codeLine = new ArrayList<StringContent> ();
	}
	
	public void setCodeLine(List<StringContent> codeLine) {
		this.codeLine = codeLine;
	}
	public List<StringContent> getCodeLine() {
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
		if (this.getClass() != obj.getClass())
			return false;
		CodeBlock other = (CodeBlock) obj;
		if (this.codeLine == null) {
			if (other.codeLine != null)
				return false;
		} else if (!this.codeLine.equals(other.codeLine))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String content = "";
		content += this.getClass().getName() + "@CodeLine: ";
		for(StringContent str: this.codeLine)
			content += str.getContent() + "\n";
		return content;
	}	
	
	@Override
	public String getContent() {
		String content = "";
		for(StringContent str: this.codeLine) {
			content += str.getContent() + "\n";
		}
		return content;
	}
	
	@Override
	public void add(StringContent element) {
		this.codeLine.add(element);
	}
}
