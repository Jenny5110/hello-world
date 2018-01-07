/**
 * It's a constructor that contains the word and an array that contains the letters of the word
 * 
 * @authors Dimitra Balabani, Ioannis Florios
 *
 */
/*Κατασκευαστης μέσα έχει την λέξη και το πίνακα της λέξης*/
/*Χρειάζεται για το lathosstofonien*/
public class lexpin {
	private String word; /*Η λέξη*/
	private String [] warr; /*Ο πίνακας που έχει την λέξη*/
 
	public lexpin (String word, String [] warr) {
		this.word = word;
		this.warr = warr;
	}
	
	public String getWord() {
		 return this.word;
	}
	
	public String [] getWarr() {
		return this.warr;
	}
	
}
