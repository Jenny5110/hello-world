import java.util.List;
import java.util.TreeMap;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu{
	System.out.println("����� ������ ���� ����������� ������");
	System.out.println("������� 1: ��������������� ��� �������");
	System.out.println("������� 2: �������� ������� ��� ������ txt");
	System.out.println("������� 3: ������ ��� �� ���������");
	Scanner ep = new Scanner(System.in);
	String text = null;
	System.out.println();
	System.out.println("������� ��� ��� ��� ����� �������� 1,2 � 3");
	int epilogi = ep.nextInt();

	while (epilogi != 3) {

		if (epilogi < 1 || epilogi > 3) {
			System.out.println("�������� ��������������� ���� ������ ��� �� 1 ����� �� 3");
			epilogi = ep.nextInt();
		} else if(epilogi == 1) {
			System.out.println("�������� �������������� �������");
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


