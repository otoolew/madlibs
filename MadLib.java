package madlibs;

import java.util.ArrayList;
/**
 * University of Pittsburgh
 * IS1017 Java Development
 * Fall 2015
 * @author William O'Toole
 */
public class MadLib {
	private String[] madLib;
	private ArrayList<Word> wordList;
	
	public MadLib(){
		String madLibString = "Dear Art Teacher. \nPlease excuse _ for being late for your _ art class.  It is my fault.  I feel _ _ was up until the _ hours of the morning finishing his/her _ project.\nJust as we were going out the _ door I saw that his/her only pair of _ had a _ in them.  \nHe/she needed to change!\nThen it took me an hour to find my _ to drive him/her to school that morning since _ missed the _ ."; 
		this.madLib = madLibString.split(" ");
		wordList = new ArrayList<Word>();
		
		wordList.add(new Word("person's name"));
		wordList.add(new Word("adjective"));
		wordList.add(new Word("adjective"));
		wordList.add(new Word("same person's name"));
		wordList.add(new Word("adjective"));
		wordList.add(new Word("adjective"));
		wordList.add(new Word("adjective"));
		wordList.add(new Word("nouns"));
		wordList.add(new Word("noun"));
		wordList.add(new Word("nouns"));
		wordList.add(new Word("same person's name"));
		wordList.add(new Word("nouns"));
		
	}

	public String[] getMadLib() {
		return madLib;
	}
	
	public ArrayList<Word> getWordList(){
		return wordList;
	}
	
	
	
}
