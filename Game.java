package madlibs;

import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
 * University of Pittsburgh
 * IS1017 Java Development
 * Fall 2015
 * @author William O'Toole
 */
public class Game {

	public static void main(String[] args) {
		MadLib ml = new MadLib();
		
		String[] madLibText = ml.getMadLib();
		ArrayList<Word> wordList = ml.getWordList(); 
		int underscoreCounter = 0;
		String finalText = "";
		
		for(String text : madLibText){
			if(text.equalsIgnoreCase("_")){
				Word word = wordList.get(underscoreCounter);
				String userInput = JOptionPane.showInputDialog("Please enter a(n) " + word.getWordType());
				word.setWord(userInput);
				finalText += word.getWord() + " ";		
				underscoreCounter++;
			}
			else{
				finalText += text + " ";
			}
		}
		
		JOptionPane.showMessageDialog(null, finalText);

	}

}
