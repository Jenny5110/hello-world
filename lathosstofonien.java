import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class lathosstofonien {
	protected String [] yota = {"�", "�", "��", "��", "�"};
	protected String [] omikron = {"�", "�"};
	protected String [] epsilon = {"�", "��"};
	protected String [] eu = {"��", "��", "��"};
	protected String [] au = {"��", "��", "��"};
	protected String [] gk = {"��", "��"};
	protected String [] tz = {"��", "���"};
	protected String [] beta = {"�","��"};
	protected String [] kapa = {"�", "��"};
	protected String [] lamda = {"�", "��"};
	protected String [] mi = {"�", "��"};
	protected String [] ni = {"�", "��"};
	protected String [] pi = {"�", "��"};
	protected String [] ro = {"�", "��"};
	protected String [] sigma = {"�", "��"};
	protected String [] taf = {"�", "��"};
	
	public void lathosSearch(String word) {
		Leksi lex = new Leksi(word);
		HashMap<Integer, String> pinakas;/*Integer � ���� ��� String �� ������ �������*/
		HashSet <String> periptosis = new HashSet<String>() ;/* �� ��������� ��� ���� ������������ ������*/
		pinakas = pinakassimfon.tableMaker(lex.getRaw()); /*� ������� �� �� �������� ������� �� ��� ������ ���� ��� ����*/
		int epomeno = 0;
		int a; /*� �������� ��� ���  for */ 
		StringBuffer test;
		ArrayList <StringBuffer> sindiasmoi = new ArrayList (); /*�� ���������� ��� ������ (�� �������� ��� ���������)*/
		ArrayList <String> endexomenes = new ArrayList();/*�� ���������� ��� ������ �� ������� �� ������������*/
		sindiasmoi.add(lex.getRaw());
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < sindiasmoi.size(); j++) {
				test = sindiasmoi.get(j);
				epomeno = i + 1;
				if (pinakas.containsKey(i) && pinakas.containsKey(epomeno)) {
					if (pinakas.get(i).equals("�")) {
						if (pinakas.get(epomeno).equals("�")) {
							for (a = 0; a < yota.length; a++) {
								test = test.delete(i, epomeno + 1);
								test = test.insert(i, yota[a]);
								sindiasmoi.add(test);
								periptosis.add(test.toString());
							}
						
						} else if (pinakas.get(epomeno).equals("�") || pinakas.get(epomeno).equals("�") || pinakas.get(epomeno).equals("�")) {
							for (a = 0; a < eu.length; a++) {
								test = test.delete(i, epomeno + 1);
								test = test.insert(i, eu[a]);
								sindiasmoi.add(test);
								periptosis.add(test.toString());
							}
						
						} else if (pinakas.get(i).equals("�")) {
							if (pinakas.get(epomeno).equals("�")) {
								for (a = 0; a < epsilon.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, epsilon[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								} 
							} else if (pinakas.get(epomeno).equals("�") || pinakas.get(epomeno).equals("�") || pinakas.get(epomeno).equals("�")) {
								for (a = 0; a < au.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, au[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("o")) {
							if (pinakas.get(epomeno).equals("�")) {
								for (a = 0; a < yota.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, yota[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(epomeno).equals("�")) {
							
							}
						} else if (pinakas.get(i).equals("�")) {
							if (pinakas.get(epomeno).equals("�")) {
								for (a = 0; a < gk.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, gk[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(epomeno).equals("�")) {
								for (a = 0; a < kapa.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, kapa[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
						} else if (pinakas.get(i).equals("�")) {
							if (pinakas.get(epomeno).equals("�")) {
								for (a = 0; a < ni.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, ni[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
						
							} else if (pinakas.get(epomeno).equals("�") && pinakas.containsKey(epomeno + 1)) {
								if (pinakas.get(epomeno + 1).equals("�")) {
									for (a = 0; a < tz.length; a++) {
										test = test.delete(i, epomeno + 2);
										test = test.insert(i, tz[a]);
										sindiasmoi.add(test);
										periptosis.add(test.toString());
									}
								} else {
						
								}
							}
						} else if (pinakas.get(i).equals("�")) {
							if (pinakas.get(epomeno).equals("�")) {
								for (a = 0; a < tz.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, tz[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
						
							} else if (pinakas.get(i).equals("�")) {
								for (a = 0; a < taf.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, taf[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
						
							}
					
						} else if (pinakas.get(i).equals("�")) {
							if (pinakas.get(epomeno).equals("�")) {
								for (a = 0; a < beta.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, beta[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("�")) {
							if (pinakas.get(epomeno).equals("�")) {
								for (a = 0; a < kapa.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, kapa[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("�")) {
							if (pinakas.get(epomeno).equals("�")) {
								for (a = 0; a < lamda.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, lamda[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("�")) {
							if (pinakas.get(epomeno).equals("�")) {
								for (a = 0; a < mi.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, mi[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("�")) {
							if (pinakas.get(epomeno).equals("�")) {
								for (a = 0; a < ni.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, ni[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("�")) {
							if (pinakas.get(epomeno).equals("�")) {
								for (a = 0; a < pi.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, pi[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("�")) {
							if (pinakas.get(epomeno).equals("�")) {
								for (a = 0; a < ro.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, ro[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("�")) {
							if (pinakas.get(epomeno).equals("�")) {
								for (a = 0; a < sigma.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, sigma[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("�")) {
							if (pinakas.get(epomeno).equals("�")) {
								for (a = 0; a < taf.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, taf[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.containsKey(i) ) {
							if (pinakas.get(i).equals("�") || pinakas.get(i).equals("�") || pinakas.get(i).equals("�")) {
								for(a = 0; a < yota.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,yota[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("�") || pinakas.get(i).equals("�")) {
								for(a = 0; a < omikron.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,omikron[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("�")) {
								for(a = 0; a < epsilon.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,epsilon[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("�")) {
								for(a = 0; a < beta.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,beta[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("�")) {
								for(a = 0; a < kapa.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,kapa[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("�")) {
								for(a = 0; a < lamda.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,lamda[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
					
							} else if (pinakas.get(i).equals("�")) {
								for(a = 0; a < mi.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,mi[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("�") && !pinakas.get(epomeno).equals("�")) {
								for(a = 0; a < ni.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,ni[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("�")) {
								for(a = 0; a < pi.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,pi[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("�")) {
								for(a = 0; a < ro.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,ro[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("�")) {
								for(a = 0; a < sigma.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,sigma[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("�") && !pinakas.get(epomeno).equals("�")) {
								for(a = 0; a < taf.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,taf[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						}
					}
				}
			}
		}
		endexomenes.addAll(periptosis); /*� ������� �� ���� ��� ����������� ������*/
	}
}