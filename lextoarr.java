/*����� �� ������ ��� ���� (�� �������� �� ����� �� ��� ���� ��� ������)*/
/*������� ��� ���� (raw) ��� ��� ������ ��� �����, ��� ���������� ��� ��� ���������� �� ����*/
import java.util.ArrayList;
public class lextoarr {
	public static String [] sepin (String word, int ton, int dial, int dialton) {
		ArrayList<String> w1 = new ArrayList<String>(); /* � ���� �� �����*/
		int i = 0;
		int epomeno = 0;
		try {
			while (i < word.length()) {
				if (word.charAt(i) == '�' && word.charAt(i + 1) == '�') {
					w1.add("��");
					i ++;
				} else if (word.charAt(i) == '�' ) {
					if (word.charAt(i+1) == '�') {
						w1.add("��");
						i ++;
					} else if (word.charAt(i + 1) == '�') {
						w1.add("��");
						i++;
					} else {
						w1.add("�");
					}
				} else if (word.charAt(i) == '�' && word.charAt(i + 1) == '�') {
					w1.add("��");
					i ++;
				} else if (word.charAt(i) == '�') {
					if (word.charAt(i + 1) == '�') {
						w1.add("��");
						i ++;
					} else if (word.charAt(i + 1) == '�') {
						w1.add("��");
						i ++;
					} else {
						w1.add("�");
					}
				} else if (word.charAt(i) == '�' ) {
					if (word.charAt(i + 1) == '�') {
						w1.add("��");
						i ++;
					} else if (word.charAt(i + 1) == '�') {
						if (word.charAt(i + 2) == '�') {
							w1.add("���");
							i ++;
						} else {
							w1.add("��");
							i ++;
						}
					} else {
						w1.add("�");
					}
				} else if (word.charAt(i) == '�') {
					if (word.charAt(i+1) == '�') {
						w1.add("��");
						i ++;
					} else if (word.charAt(i + 1) == '�') {
						w1.add("��");
						i ++;
					} else {
						w1.add("�");
					}
				} else if (word.charAt(i) == '�' && word.charAt(i + 1) == '�') {
					w1.add("��");
					i ++;
				} else if (word.charAt(i) == '�') {
					if (word.charAt(i + 1) == '�') {
						w1.add("��");
						i ++;
					} else if (word.charAt(i + 1) == '�') {
						w1.add("��");
						i ++;
					} else {
						w1.add("�");
					}
				} else if (word.charAt(i) == '�' ) {
					if (word.charAt(i + 1) == '�') {
						w1.add("��");
						i ++;
					} else if (word.charAt(i + 1) == '�') {
						w1.add("��");
						i ++;
					} else if (word.charAt(i + 1) == '�') {
						w1.add("��");
						i ++;
					} else {
						w1.add("�");
					}
				} else if (word.charAt(i) == '�' && word.charAt(i + 1) == '�') {
					w1.add("��");
					i ++;
				} else if (word.charAt(i) == '�' && word.charAt(i + 1) == '�') {
					w1.add("��");
					i ++;
				} else if (word.charAt(i) == '�' && ton != i) {
					if (word.charAt(i + 1) == '�' && !(dial == i + 1 || dialton == i + 1 )) {
						w1.add("��");
						i ++;
					} else if (word.charAt(i + 1) == '�' && !( dial == i + 1 || dialton == i + 1)) {
						w1.add("o�");
						i ++;
					} else {
						w1.add("�");
					}
				} else if (word.charAt(i) == '�' && (ton != i)) {
					if (word.charAt(i + 1) == '�' && !(dial == i + 1 || dialton == i + 1)) {
						w1.add("��");
						i ++;
					} else if ( word.charAt(i + 1) == '�' && !( dial == i + 1 || dialton == i + 1)) {
						w1.add("��");
						i ++;
					} else if (word.charAt(i + 1) == '�') {
						w1.add("��");
						i ++;
					} else if (word.charAt(i + 1) == '�') {
						w1.add("��");
						i ++;
					} else {
						w1.add("�");
					}
				} else if (word.charAt(i) == '�' && (ton != i)) {
					if (word.charAt(i + 1) == '�' && !(dial == i + 1 || dialton == i + 1)) {
						w1.add("��");
						i ++;
					} else if ( word.charAt(i + 1) == '�' && !( dial == i + 1 || dialton == i + 1)) {
						w1.add("��");
						i ++;
					} else if (word.charAt(i + 1) == '�') {
						w1.add("��");
						i ++;
					} else if (word.charAt(i + 1) == '�') {
						w1.add("��");
						i ++;
					} else {
						w1.add("�");
					}
				} else {
					w1.add(Character.toString(word.charAt(i)));
				}
				i ++;
			}
		}catch (Exception e){
			w1.add(Character.toString(word.charAt(i)));
		}
		String [] w2 = new String[w1.size()];/*� ����� �� ������ (� ������� ������� ����������� ��� �� �� ������������ �� String*/
		for (int q = 0; q < w2.length; q++) {
			w2[q] = w1.get(q);
		}
		return w2;
	}
}