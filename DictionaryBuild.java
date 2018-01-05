import java.util.Scanner;
import java.util.TreeMap;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.*;



public class DictionaryBuild {

	private static Scanner input;
	
	protected static TreeMap<String,String> Dictionary;
	
	public static void openFile(){
		try 
		{
			input = new Scanner(Paths.get("greek_dictionary.txt")); 
		}
		catch (IOException ioException)
		{
			System.err.println("Error opening file. Terminating.");
			System.exit(1);
		}
	}
	
	public static void closeFile()
	{
		if (input != null)
			input.close();
	}
	
	public static TreeMap<String,String> readRecord(){
		openFile();
		
		
		 try
		 {
			 String lex;
			 Leksi word;
			 String leksikey ;
			 String leksivalue;
			 Dictionary = new TreeMap<String,String>();
			 while (input.hasNext())
			 {
				 lex = input.next();
				 word = new Leksi(lex);
				 leksikey = word.getRaw().toString();
				 leksivalue = lex;
				 Dictionary.put(leksikey, leksivalue);
				 
				 }
		 }
		 catch (NoSuchElementException elementException)
		 {
			 System.err.println("File improperly formed. Terminating.");
		 }
		 catch (IllegalStateException stateException)
		 {
			 System.err.println("Error reading from file. Terminating.");
		 }
		 
		 closeFile();
		 
		 return Dictionary;
	}
}


