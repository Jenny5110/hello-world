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
		HashSet <String> periptosis = new HashSet<String>() ;/* θα χρειαστει για μετα μοναδικοτητα λεξεων*/
		int a, i, j; /*Ο μετρητης για τις  for */ 
		ArrayList <lexpin> sindiasmoi = new ArrayList (); /*οι συνδυασμοι των λεξεων (θα υπάρχουν και διπλοτυπα)*/
		ArrayList <String> endexomenes = new ArrayList();/*Οι συνδυασμόι των λέξεων σε Στρινγκ με μοναδικότητα*/
		String w = lex.getRaw().toString();
		String pinword [] = lextoarr.sepin(w, tonos, dialitika, dialitikatonos );/* ο πινακας που είναι μέσα η λέξη*/
		sindiasmoi.add(new lexpin(w, pinword));
		String [] pinakas; /*Θα αποθηκεύεται προσωρίνα ο πίνακας της λέξης που εξετάζεται*/
		int mikoslex = pinword.length;
		StringBuilder wbuilder;/*Χρειάζεται για μετατροπή από πίνακα σε String*/
		String wstr;/*το String που προκύπτει μετά απο το Build*/
		lexpin mpal; /*Αυτό που θα μπαίνει στη λίστα*/
		String [] p;/*προσωρινή αποθήκευση*/
		
		for (i = 0; i < mikoslex; i++) {
			int mikoslist = sindiasmoi.size();
			for (j = 0; j < mikoslist; j++) {
				pinakas = sindiasmoi.get(j).getWarr();
				/*Yotas*/
				if (pinakas [i].equals("ι") || pinakas [i].equals("η") || pinakas [i].equals("οι") || pinakas [i].equals("ει") || pinakas [i].equals("υ") ) {
					pinakas[i] = "ι";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "η";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas[i] = "οι";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "ει";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas[i] = "υ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	
			    	sindiasmoi.add(mpal);
				/*omikron*/
				} else if (pinakas [i].equals("ο") || pinakas [i].equals("ω")) {
					pinakas[i] = "ο";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "ω";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*epsilon*/
				} else if (pinakas [i].equals("ε") || pinakas [i].equals("αι")) {
					pinakas[i] = "ε";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "αι";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*eu*/
				} else if (pinakas [i].equals("ευ") || pinakas [i].equals("εφ") || pinakas[i].equals("εβ")) {
			    	pinakas [i] = "ευ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "εφ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "εβ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*au*/
				} else if (pinakas [i].equals("αυ") || pinakas [i].equals("αφ") || pinakas[i].equals("αβ") ) {
			    	pinakas [i] = "αυ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "αφ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "αβ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*gk*/
				} else if (pinakas [i].equals("γκ") || pinakas [i].equals("γγ")) {
			    	pinakas [i] = "γκ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "γγ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*tz*/
				} else if (pinakas [i].equals("τζ") || pinakas [i].equals("ντζ")) {
			    	pinakas [i] = "τζ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "ντζ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*beta*/
				} else if (pinakas [i].equals("β") || pinakas [i].equals("ββ")) {
			    	pinakas [i] = "β";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "ββ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*kapa*/
				} else if (pinakas [i].equals("κ") || pinakas [i].equals("κκ")) {
			    	pinakas [i] = "κ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "κκ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*lamda*/
				} else if (pinakas [i].equals("λ") || pinakas [i].equals("λλ")) {
			    	pinakas [i] = "λ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "λλ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    /*mi*/	
				} else if (pinakas [i].equals("μ") || pinakas [i].equals("μμ")) {
			    	pinakas [i] = "μ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "μμ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    /*ni*/
				} else if (pinakas [i].equals("ν") || pinakas [i].equals("νν")) {
			    	pinakas [i] = "ν";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "νν";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*pi*/
				} else if (pinakas [i].equals("π") || pinakas [i].equals("ππ")) {
			    	pinakas [i] = "π";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "ππ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*ro*/
				} else if (pinakas [i].equals("ρ") || pinakas [i].equals("ρρ")) {
			    	pinakas [i] = "ρ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "ρρ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*sigma*/
				} else if (pinakas [i].equals("σ") || pinakas [i].equals("σσ")) {
			    	pinakas [i] = "σ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "σσ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
				/*taf*/
				} else if (pinakas [i].equals("τ") || pinakas [i].equals("ττ")) {
			    	pinakas [i] = "τ";
			    	p = pinakas.clone();
			    	wbuilder = new StringBuilder();
			    	for (String s : pinakas) {
						wbuilder.append(s);
					}
					wstr = wbuilder.toString();
			    	mpal = new lexpin(wstr, p);
			    	sindiasmoi.add(mpal);
			    	
			    	pinakas [i] = "ττ";
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
			periptosis.add(sindiasmoi.get(j).getWord());/*Παιρνει τις λέξεις και εξαφανίζει τα διπλότυπα*/
		}
		endexomenes.addAll(periptosis); /*ο πινακας με ολες τις ενδεχομενες λεξεις*/
		return endexomenes;
	}
}