/*���������� ��� ���������� ��� ������ �� �� �������� ��� �� ������� ��� ��� ������ ����*/
import java.util.*;
import java.util.HashMap;

public class pinakassimfon {
	protected static String [] fonien = {"�", "�", "�", "�", "�", "�", "�"};
	protected static String [] simfono = { "�", "�", "�", "�", "�", "�", "�", "�", "�"};
	
	public static HashMap<Integer, String> tableMaker(StringBuffer word) {
		int count;
		HashMap<Integer, String> fosi = new HashMap<Integer, String>();/*������� ��� �������� �� ������� ��� �� �������� ���� ����� ��� ������� �� ��� ������ ���� ��� ����*/
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
