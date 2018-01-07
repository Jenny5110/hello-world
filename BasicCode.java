import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
/**
 * Contains our main class
 * 
 * @author Panagiotis Skias, Dimitra Balabani, Ioannis Florios
 *
 */

/*Δέχεται ένα κείμενο και ελέγχει αν κάθε λέξη περιέχεται στο λεξικό. Αν περιέχεται στο λεξικό είναι σωστή αν όχι είναι λάθος*/
public class BasicCode {
	public static void main (String [] args) {
		String text = Menu.Display();
		if (text.equals(" ")) {
			System.exit(0);
		}
		TreeMap<String,String> Dictionary = DictionaryBuild.readRecord();
		List<String> wordsList = checkText.wordSplit(text);
		String word;
		String persynt; /*Συντομογραφία*/
		String kefprot; /*Κεφαλαίο το πρώτο γράμμα*/
		String lex = null; /*Η λέξη που εξάγεται κάθε φορά από την λίστα*/
		ArrayList <String> endexomenes = new ArrayList<String>();
		/*Ως key λέξη raw και ως value η λέξη με τόνους κλπ*/
		for (int i = 0; i < wordsList.size(); i++){
			word = wordsList.get(i);
			StringBuilder lower = new StringBuilder(word);
			char b = lower.charAt(0);
			lower.setCharAt(0, Character.toLowerCase(b));
			String wordb = lower.toString();
			if (Dictionary.containsValue(wordb) == false && Dictionary.containsValue(word) == false ) {
				
				System.out.printf("\t**Στη λέξη %s εντοπίστηκε κάποιο λάθος**\n", word);
				System.out.println();
				/*Περιπτωση όλων κεφαλαίων*/
				persynt = Kefalaio(word, word.length());
				
			    /*Περίπτωση κεφαλαίο πρώτο γράμμα*/
				kefprot = Kefalaio(word, 0);
				
				if (Dictionary.containsValue(persynt)) {
					System.out.printf("->Στη λέξη %s έπρεπε όλα τα γράμματα να είναι κεφαλαία \n", word);
					System.out.printf("->Άρα η λέξη γίνεται %s \n",persynt);
				} else if (Dictionary.containsValue(kefprot)) {
					System.out.printf("->Στη λέξη %s έπρεπε τo πρώτο γράμμα να είναι κεφαλαία \n", word);
					System.out.printf("->Άρα η λέξη γίνεται %s \n", kefprot);
				} else {
					endexomenes = lathosstofonien.lathosSearch(word);
					ArrayList <String> lyseis = new ArrayList <String>();
					for (int k=0; k < endexomenes.size(); k++) {
						lex = endexomenes.get(k);
						if (Dictionary.containsKey(lex)) {
							lyseis.add(Dictionary.get(lex));
						}
					}
					System.out.printf("Οι προτεινόμενες λύσεις για τη λέξη %s είναι :\n",word );
					for (int a = 0; a < lyseis.size(); a++) {
						System.out.printf("\t\t-> %s\n",lyseis.get(a));
					}
				}
			}
			System.out.println();
		}
	}
	
	public static String Kefalaio (String word, int length) {
		StringBuilder upper = new StringBuilder(word);
		char c;
		if (length == word.length()) {
			for (int index = 0; index < upper.length(); index++ ) {
				c = upper.charAt(index);
				if (Character.isLowerCase(c)) {
					upper.setCharAt(index, Character.toUpperCase(c));
				}
			}
			return upper.toString();
		} else {
			upper = new StringBuilder(word);
			c = upper.charAt(0);
			upper.setCharAt(0, Character.toUpperCase(c));
			return upper.toString();
		}
	}
		
}
