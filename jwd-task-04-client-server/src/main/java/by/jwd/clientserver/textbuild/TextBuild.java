package by.jwd.clientserver.textbuild;

import by.jwd.clientserver.entity.Text;

public interface TextBuild {
	public Text getText();
	public void setSentence(String[] sentences);
	public void setCodeBlock(String codeLine);
}
