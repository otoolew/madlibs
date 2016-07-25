package madlibs;
/**
 * University of Pittsburgh
 * IS1017 Java Development
 * Fall 2015
 * @author William O'Toole
 */
public class Word {
	private String wordType;
	private String word;
	
	public Word(String wordType){
		this.wordType = wordType;
		this.word = "";
	}

	public String getWordType() {
		return wordType;
	}

	public void setWordType(String wordType) {
		this.wordType = wordType;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
}
