/*Κατασκευαστης μέσα έχει την λέξη και το πίνακα της λέξης*/
/*Χρειάζεται για το lathosstofonien*/
public class lexpin {
	private String word; /*Η λέξη */ 
	private String [] warr; /* Ο πίνακας που έχει τη λέξη */
 
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
