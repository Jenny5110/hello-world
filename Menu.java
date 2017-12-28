import java.util.List;
import java.util.TreeMap;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu{
	System.out.println("Καλώς ήρθατε στον Ορθογραφικό έλεγχο");
	System.out.println("Επιλογή 1: Πληκτρολογείστε ένα κείμενο");
	System.out.println("Επιλογή 2: Εισάγετε κείμενο από αρχείο txt");
	System.out.println("Επιλογή 3: Έξοδος από το πρόγραμμα");
	Scanner ep = new Scanner(System.in);
	String text = null;
	System.out.println();
	System.out.println("Πατήστε μία από τις τρείς επιλογές 1,2 ή 3");
	int epilogi = ep.nextInt();

	while (epilogi != 3) {

		if (epilogi < 1 || epilogi > 3) {
			System.out.println("Παρακαλώ πληκτρολογείστε έναν αριθμό από το 1 μέχρι το 3");
			epilogi = ep.nextInt();
		} else if(epilogi == 1) {
			System.out.println("Παρακαλώ πληκρολογείστε κείμενο");
			text = input.nextLine();
		} else {
			try {
				text = readFile.readTextFile();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


