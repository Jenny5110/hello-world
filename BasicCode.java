import java.util.List;
import java.util.TreeMap;
import java.util.Scanner;

/*Δέχεται ένα κείμενο και ελέγχει αν κάθε λέξη περιέχεται στο λεξικό. Αν περιέχεται στο λεξικό είναι σωστή αν όχι είναι λάθος*/
public class BasicCode {
	public static void main (String [] args){
		System.out.println("Καλώς ήρθατε στον Ορογραφικό Έλεγχο");
		System.out.println("Γράψε το κείμενο");
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		input.close();
		TreeMap<String,Leksi> Dictionary = DictionaryBuild.readRecord();
		List<String> wordsList = checkText.wordSplit(text);
		String word;
		for (int i = 0; i < wordsList.size(); i++){
			word = wordsList.get(i);
			System.out.println();
			if (Dictionary.containsKey(word) == true){
				System.out.printf("Η λέξη %s είναι σωστή ",word);
			} else {
				System.out.printf("Η λέξη %s είναι λάθος  ",word);
			}
		}
		
	}

}