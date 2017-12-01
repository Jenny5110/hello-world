import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class lathosstofonien {
	protected String [] yota = {"ι", "η", "οι", "ει", "υ"};
	protected String [] omikron = {"ο", "ω"};
	protected String [] epsilon = {"ε", "αι"};
	protected String [] eu = {"ευ", "εβ", "εφ"};
	protected String [] au = {"αυ", "αβ", "αφ"};
	protected String [] gk = {"γκ", "γγ"};
	protected String [] tz = {"τζ", "ντζ"};
	protected String [] beta = {"β","ββ"};
	protected String [] kapa = {"κ", "κκ"};
	protected String [] lamda = {"λ", "λλ"};
	protected String [] mi = {"μ", "μμ"};
	protected String [] ni = {"ν", "νν"};
	protected String [] pi = {"π", "ππ"};
	protected String [] ro = {"ρ", "ρρ"};
	protected String [] sigma = {"σ", "σσ"};
	protected String [] taf = {"τ", "ττ"};
	
	
	public void lathosSearch(String word) {
		Leksi lex = new Leksi(word);
		HashMap<Integer, String> pinakas;/*Integer η θέση και String το φωνηεν συμφωνο*/
		HashSet <String> periptosis = new HashSet<String>() ;/* θα χρειαστει για μετα μοναδικοτητα λεξεων*/
		pinakas = pinakassimfon.tableMaker(lex.getRaw()); /*Ο πίνακας με τα φωνηεντα συμφωνα με τις θεσεις τους στη λέξη*/
		int epomeno = 0;
		int a; /*Ο μετρητης για τις  for */ 
		StringBuffer test;
		ArrayList <StringBuffer> sindiasmoi = new ArrayList (); /*οι συνδυασμοι των λεξεων (θα υπάρχουν και διπλοτυπα)*/
		ArrayList <String> endexomenes = new ArrayList();/*Οι συνδυασμόι των λέξεων σε Στρινγκ με μοναδικότητα*/
		sindiasmoi.add(lex.getRaw());
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < sindiasmoi.size(); j++) {
				test = sindiasmoi.get(j);
				epomeno = i + 1;
				if (pinakas.containsKey(i) && pinakas.containsKey(epomeno)) {
					if (pinakas.get(i).equals("ε")) {
						if (pinakas.get(epomeno).equals("ι")) {
							for (a = 0; a < yota.length; a++) {
								test = test.delete(i, epomeno + 1);
								test = test.insert(i, yota[a]);
								sindiasmoi.add(test);
								periptosis.add(test.toString());
							}
						
						} else if (pinakas.get(epomeno).equals("υ") || pinakas.get(epomeno).equals("β") || pinakas.get(epomeno).equals("φ")) {
							for (a = 0; a < eu.length; a++) {
								test = test.delete(i, epomeno + 1);
								test = test.insert(i, eu[a]);
								sindiasmoi.add(test);
								periptosis.add(test.toString());
							}
						
						} else if (pinakas.get(i).equals("α")) {
							if (pinakas.get(epomeno).equals("ι")) {
								for (a = 0; a < epsilon.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, epsilon[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								} 
							} else if (pinakas.get(epomeno).equals("υ") || pinakas.get(epomeno).equals("φ") || pinakas.get(epomeno).equals("β")) {
								for (a = 0; a < au.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, au[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("ο")) {
							if (pinakas.get(epomeno).equals("ι")) {
								for (a = 0; a < yota.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, yota[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(epomeno).equals("õ")) {
							
							}
						} else if (pinakas.get(i).equals("γ")) {
							if (pinakas.get(epomeno).equals("γ")) {
								for (a = 0; a < gk.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, gk[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(epomeno).equals("κ")) {
								for (a = 0; a < kapa.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, kapa[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
						} else if (pinakas.get(i).equals("ν")) {
							if (pinakas.get(epomeno).equals("ν")) {
								for (a = 0; a < ni.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, ni[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
						
							} else if (pinakas.get(epomeno).equals("τ") && pinakas.containsKey(epomeno + 1)) {
								if (pinakas.get(epomeno + 1).equals("ζ")) {
									for (a = 0; a < tz.length; a++) {
										test = test.delete(i, epomeno + 2);
										test = test.insert(i, tz[a]);
										sindiasmoi.add(test);
										periptosis.add(test.toString());
									}
								} else {
						
								}
							}
						} else if (pinakas.get(i).equals("τ")) {
							if (pinakas.get(epomeno).equals("ζ")) {
								for (a = 0; a < tz.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, tz[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
						
							} else if (pinakas.get(i).equals("τ")) {
								for (a = 0; a < taf.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, taf[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
						
							}
					
						} else if (pinakas.get(i).equals("β")) {
							if (pinakas.get(epomeno).equals("β")) {
								for (a = 0; a < beta.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, beta[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("κ")) {
							if (pinakas.get(epomeno).equals("κ")) {
								for (a = 0; a < kapa.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, kapa[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("λ")) {
							if (pinakas.get(epomeno).equals("λ")) {
								for (a = 0; a < lamda.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, lamda[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("μ")) {
							if (pinakas.get(epomeno).equals("μ")) {
								for (a = 0; a < mi.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, mi[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("ν")) {
							if (pinakas.get(epomeno).equals("ν")) {
								for (a = 0; a < ni.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, ni[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("π")) {
							if (pinakas.get(epomeno).equals("π")) {
								for (a = 0; a < pi.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, pi[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("ρ")) {
							if (pinakas.get(epomeno).equals("ρ")) {
								for (a = 0; a < ro.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, ro[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("σ")) {
							if (pinakas.get(epomeno).equals("σ")) {
								for (a = 0; a < sigma.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, sigma[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.get(i).equals("τ")) {
							if (pinakas.get(epomeno).equals("τ")) {
								for (a = 0; a < taf.length; a++) {
									test = test.delete(i, epomeno + 1);
									test = test.insert(i, taf[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							}
						} else if (pinakas.containsKey(i) ) {
							if (pinakas.get(i).equals("ι") || pinakas.get(i).equals("η") || pinakas.get(i).equals("υ")) {
								for(a = 0; a < yota.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,yota[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("ο") || pinakas.get(i).equals("ω")) {
								for(a = 0; a < omikron.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,omikron[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("ε")) {
								for(a = 0; a < epsilon.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,epsilon[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("β")) {
								for(a = 0; a < beta.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,beta[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("κ")) {
								for(a = 0; a < kapa.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,kapa[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("λ")) {
								for(a = 0; a < lamda.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,lamda[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
					
							} else if (pinakas.get(i).equals("μ")) {
								for(a = 0; a < mi.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,mi[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("ν") && !pinakas.get(epomeno).equals("τ")) {
								for(a = 0; a < ni.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,ni[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("π")) {
								for(a = 0; a < pi.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,pi[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("ρ")) {
								for(a = 0; a < ro.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,ro[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("σ")) {
								for(a = 0; a < sigma.length; a++) { 
									test = test.delete(i,i + 1);
									test = test.insert(i,sigma[a]);
									sindiasmoi.add(test);
									periptosis.add(test.toString());
								}
							} else if (pinakas.get(i).equals("τ") && !pinakas.get(epomeno).equals("ζ")) {
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
		endexomenes.addAll(periptosis); /*ο πινακας με ολες τις ενδεχομενες λεξεις*/
	}
}
