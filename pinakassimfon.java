/*Δημιουργεί και επιστρέφει ενα πίνακα με τα φωνηεντα και τα συμφωνα και τις θεσεις τους*/
import java.util.*;
import java.util.HashMap;

public class pinakassimfon {
	protected static String [] fonien = {"α", "ε", "η", "ι", "ο", "υ", "ω"};
	protected static String [] simfono = { "β", "κ", "λ", "μ", "ν", "π", "ρ", "σ", "τ"};
	
	public static HashMap<Integer, String> tableMaker(StringBuffer word) {
		int count;
		HashMap<Integer, String> fosi = new HashMap<Integer, String>();/*πίνακας που περιέχει τα συμφωνα και τα φωνηεντα μιας λέξης που δίνεται με τις θέσεις τους στη λέξη*/
		for (int i = 0; i < word.length(); i++) {
			
			for (int h = 0; h < fonien.length; h++) {
				count = i;
				if (word.substring(count, count + 1).equals(fonien[h])) {
					fosi.put(i, fonien[h]);
					break;
				}
			
			}
			for (int j = 0; j < simfono.length; j++) {
				count = i;
				if (word.substring(count, count + 1).equals(simfono[j])) {
					fosi.put(i, simfono[j]);
					break;
				}
			}
			
		}
		return fosi;
	}
}
