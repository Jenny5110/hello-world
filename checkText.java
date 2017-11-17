import java.util.*;


public class checkText{
	/* Total words */
	static int words = 0;

		/**
		 * Splits the words in the text, pushes them into a List and counts them.
		 */
		public static List<String> wordSplit(String text){

		StringBuilder sb = new StringBuilder(text);
		/* Avoiding errors */
		int endOfLine = text.length() - 1;

		/* Changes its value to true when a whitespace is followed by a character */
		boolean word = false;

		/* Loops through the text and counts the words */
		for(int i=0; i < text.length() ; i++ ) {

			 boolean whiteSpace = Character.isWhitespace(text.charAt(i));
			 boolean character = !Character.isWhitespace(text.charAt(i));

			if (character && i == 0) {
				words++;
			}else if (whiteSpace && i == 0){
				sb.deleteCharAt(i);
			}else if (whiteSpace && i == endOfLine){

				break;
			}else if (whiteSpace && !Character.isWhitespace(text.charAt(i + 1))){

				word = true;

			} else if (word == true) {
				words++;
				word = false;
			}

		}
		/* Replacing two or more whitspaces with one whitespace */
		String after = text.trim().replaceAll(" +", " ");

		/* Creating the list 'words' and fiils it with every word on our text */
		ArrayList<String> wordsList = new ArrayList<String>();
		for(String i : after.split(" ")) {
				    wordsList.add(i);
		}

		return wordsList;
	}
}
