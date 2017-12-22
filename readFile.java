package movies;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 * Reads a file containing text and return it as a String
 *
 * @author Thanos
 *
 */
public class readFile {
	
	public readFile() {}
	


	public String readTextFile() throws FileNotFoundException, IOException {
			Scanner input = new Scanner(System.in);
			System.out.println("Κάντε αντιγραφή και επικόλληση τη διεύθυνση του αρχείου text που θέλετε να περάσει απο ορθογραφικό έλεγχο.\n");
			String url = input.nextLine();
			BufferedReader br = new BufferedReader(new FileReader(url));
			
			try {
				 StringBuilder sb = new StringBuilder();
				 String line = br.readLine();
				 
				 while(line != null) {
					 sb.append(line);
					 sb.append("\n");
					 line = br.readLine();
				 }
				return sb.toString();
			} catch (FileNotFoundException e) {
				throw new FileNotFoundException("Το αρχείο text δεν βρέθηκε ή δεν ειναι σε μορφή text" +e.getMessage());
			} finally {
				br.close();
				input.close();
			}
			
				
	}
			
	}


