import java.util.Scanner;
import java.io.*;
/**
 * It's our Menu
 * @return the text that will be checked for errors
 * 
 * @author Panagiotis Skias, Dimitra Balabani, Ioannis Florios
 *
 */

public class Menu{
	public static String Display() {
		System.out.println("|\t**Καλώς ήρθατε στον ορθογραφικό έλεγχο**\t|");
		System.out.println();
		System.out.println("->\tΕπιλογή 1: Πληκτρολογείστε ένα κείμενο");
		System.out.println("->\tΕπιλογή 2: Εισάγετε κείμενο από αρχείο txt");
		System.out.println("->\tΕπιλογή 3: Έξοδος από το πρόγραμμα");
		System.out.println();
		System.out.println();
		System.out.println();
		Scanner ep = new Scanner(System.in);
		String text = " ";
		System.out.println();
		System.out.println("Επιλέξτε μία από τις τρείς επιλογές 1, 2 ή 3");
		System.out.println();
		System.out.println();
		int epilogi = ep.nextInt();

		while (epilogi != 3) {

			if (epilogi < 1 || epilogi > 3) {
				System.out.println("\t!!!Κάτι πήγε στραβά!!!");
				System.out.println("\t***!Ξαναπροσπάθησε!***");
				System.out.println("Παρακαλώ πληκτρολογείστε έναν αριθμό από το 1 μέχρι το 3");
				epilogi = ep.nextInt();
			} else if (epilogi == 1) {
				System.out.println("Παρακαλώ πληκτρολογείστε κείμενο");
				System.out.println("Μπορείτε να κάνετε και αντιγραφή το κείμενο σας (μαρκάρισμα και Ctrl+C)");
				System.out.println("\t\tΚαι να το κάνετε επικόλληση εδώ πατώντας Ctrl+V ή το δεξί κουμπί του ποντικιού ");
				
				Scanner input = new Scanner (System.in);
				text = input.nextLine();
				return text;
			} else if (epilogi == 2) {
				try {
					System.out.println("\t\t***Οδηγίες***");
					System.out.println("**Σε αυτή την επιλογή πρέπει να μεταβείτε στον φάκελο που είναι το αρχείο**");
					System.out.println("**Πηγαίνετε στη μπάρα διευθύνσεων μαρκάρετε την και πραγματοποιήστε αντιγραφή (μαρκάρισμα και Ctrl+C)**");
					System.out.println("**επικολλήστε την (Ctrl+V ή το δεξί κουμπί του ποντικιού) και έπειτα προσθέστε το σύμβολο '\' και το όνομα του αρχείου συνοδευόμενο με την κατάληξη '.txt' **");
					System.out.println("\t!!!Βεβαιωθείτε ότι το αρχείο βρίσκετε σε κωδικοποίηση ANSI!!!");
					System.out.println();
					System.out.println();
					System.out.println("Βάλτε τη διεύθυνση του αρχείου εδώ:");
					
					text = readFile.readTextFile();
					return text;
				} catch (java.io.FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	return text;
	}
}
