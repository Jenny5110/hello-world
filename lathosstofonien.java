import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;

public class lathosstofonien {

	
	public static ArrayList<String> lathosSearch(String word) {
		Leksi lex = new Leksi(word);
		int dialitika = lex.getDialitika();
		int tonos = lex.getTonos();
		int dialitikatonos = lex.getDialtonos(); 
		HashSet <String> periptosis = new HashSet<String>() ;/* �� ��������� ��� ���� ������������ ������*/
		int a, i, j; /*� �������� ��� ���  for */ 
		ArrayList <lexpin> sindiasmoi = new ArrayList (); /*�� ���������� ��� ������ (�� �������� ��� ���������)*/
		ArrayList <String> endexomenes = new ArrayList();/*�� ���������� ��� ������ �� ������� �� ������������*/
		String w = lex.getRaw().toString();
		String pinword [] = lextoarr.sepin(w, tonos, dialitika, dialitikatonos );/* � ������� ��� ����� ���� � ����*/
		sindiasmoi.add(new lexpin(w, pinword));
		String [] pinakas; /*�� ������������ ��������� � ������� ��� ����� ��� ����������*/
		int mikoslex = pinword.length;
		StringBuilder wbuilder;/*���������� ��� ��������� ��� ������ �� String*/
		String wstr;/*�� String ��� ��������� ���� ��� �� Build*/
		lexpin mpal; /*���� ��� �� ������� ��� �����*/
		String [] p;/*��������� ����������*/
		
		for (i = 0; i < mikoslex; i++) {
			int mikoslist = sindiasmoi.size();
			for (j = 0; j < mikoslist; j++) {
				pinakas = sindiasmoi.get(j).getWarr();
				/*Yotas*/
				if (pinakas [i].equals("�") || pinakas [i].equals("�") || pinakas [i].equals("��") || pinakas [i].equals("��") || pinakas [i].equals("�") ) {
					pinakas[i] = "�";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "�";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas[i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas[i] = "�";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	
			    	sindiasmoi.add(mpal);
				/*omikron*/
				} else if (pinakas [i].equals("�") || pinakas [i].equals("�")) {
					pinakas[i] = "�";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "�";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*epsilon*/
				} else if (pinakas [i].equals("�") || pinakas [i].equals("��")) {
					pinakas[i] = "�";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*eu*/
				} else if (pinakas [i].equals("��") || pinakas [i].equals("��") || pinakas[i].equals("��")) {
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*au*/
				} else if (pinakas [i].equals("��") || pinakas [i].equals("��") || pinakas[i].equals("��") ) {
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*gk*/
				} else if (pinakas [i].equals("��") || pinakas [i].equals("��")) {
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*tz*/
				} else if (pinakas [i].equals("��") || pinakas [i].equals("���")) {
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "���";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*beta*/
				} else if (pinakas [i].equals("�") || pinakas [i].equals("��")) {
			    	pinakas [i] = "�";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*kapa*/
				} else if (pinakas [i].equals("�") || pinakas [i].equals("��")) {
			    	pinakas [i] = "�";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*lamda*/
				} else if (pinakas [i].equals("�") || pinakas [i].equals("��")) {
			    	pinakas [i] = "�";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    /*mi*/	
				} else if (pinakas [i].equals("�") || pinakas [i].equals("��")) {
			    	pinakas [i] = "�";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    /*ni*/
				} else if (pinakas [i].equals("�") || pinakas [i].equals("��")) {
			    	pinakas [i] = "�";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*pi*/
				} else if (pinakas [i].equals("�") || pinakas [i].equals("��")) {
			    	pinakas [i] = "�";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*ro*/
				} else if (pinakas [i].equals("�") || pinakas [i].equals("��")) {
			    	pinakas [i] = "�";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*sigma*/
				} else if (pinakas [i].equals("�") || pinakas [i].equals("��")) {
			    	pinakas [i] = "�";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*taf*/
				} else if (pinakas [i].equals("�") || pinakas [i].equals("��")) {
			    	pinakas [i] = "�";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "��";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				}
			}
		}
		for (j = 0; j < sindiasmoi.size(); j++) {
			periptosis.add(sindiasmoi.get(j).getWord());/*������� ��� ������ ��� ���������� �� ���������*/
		}
		endexomenes.addAll(periptosis); /*� ������� �� ���� ��� ����������� ������*/
		return endexomenes;
	}
}