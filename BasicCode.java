import java.util.List;
import java.util.TreeMap;
import java.util.Scanner;

/*������� ��� ������� ��� ������� �� ���� ���� ���������� ��� ������. �� ���������� ��� ������ ����� ����� �� ��� ����� �����*/
public class BasicCode {
	public static void main (String [] args){
		System.out.println("����� ������ ���� ���������� ������");
		System.out.println("����� �� �������");
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
				System.out.printf("� ���� %s ����� ����� ",word);
			} else {
				System.out.printf("� ���� %s ����� �����  ",word);
			}
		}
		
	}

}