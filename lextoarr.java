/*βάζει σε πινακα μια λέξη (τα διθφογγα τα βάζει σε μια θέση του πίνακα)*/
/*Παιρνει μια λέξη (raw) και τις θέσεις του τόνου, των διαλυτικών και των διαλυτικών με τόνο*/
import java.util.ArrayList;
public class lextoarr {
	public static String [] sepin (String word, int ton, int dial, int dialton) {
		ArrayList<String> w1 = new ArrayList<String>(); /* Η λέξη σε λίστα*/
		int i = 0;
		int epomeno = 0;
		try {
			while (i < word.length()) {
				if (word.charAt(i) == 'β' && word.charAt(i + 1) == 'β') {
					w1.add("ββ");
					i ++;
				} else if (word.charAt(i) == 'κ' ) {
					if (word.charAt(i + 1) == 'κ') {
						w1.add("κκ");
						i ++;
					} else if (word.charAt(i + 1) == 'τ') {
						w1.add("κτ");
						i++;
					} else {
						w1.add("κ");
					}
				} else if (word.charAt(i) == 'λ' && word.charAt(i + 1) == 'λ') {
					w1.add("λλ");
					i ++;
				} else if (word.charAt(i) == 'μ') {
					if (word.charAt(i + 1) == 'μ') {
						w1.add("μμ");
						i ++;
					} else if (word.charAt(i + 1) == 'π') {
						w1.add("μπ");
						i ++;
					} else {
						w1.add("μ");
					}
				} else if (word.charAt(i) == 'ν' ) {
					if (word.charAt(i + 1) == 'ν') {
						w1.add("νν");
						i ++;
					} else if (word.charAt(i + 1) == 'τ') {
						if (word.charAt(i + 2) == 'ζ') {
							w1.add("ντζ");
							i ++;
						} else {
							w1.add("ντ");
							i ++;
						}
					} else {
						w1.add("ν");
					}
				} else if (word.charAt(i) == 'π') {
					if (word.charAt(i + 1) == 'π') {
						w1.add("ππ");
						i ++;
					} else if (word.charAt(i + 1) == 'τ') {
						w1.add("πτ");
						i ++;
					} else {
						w1.add("π");
					}
				} else if (word.charAt(i) == 'ρ' && word.charAt(i + 1) == 'ρ') {
					w1.add("ρρ");
					i ++;
				} else if (word.charAt(i) == 'σ') {
					if (word.charAt(i + 1) == 'σ') {
						w1.add("σσ");
						i ++;
					} else if (word.charAt(i + 1) == 'τ') {
						w1.add("στ");
						i ++;
					} else {
						w1.add("σ");
					}
				} else if (word.charAt(i) == 'τ' ) {
					if (word.charAt(i + 1) == 'τ') {
						w1.add("ττ");
						i ++;
					} else if (word.charAt(i + 1) == 'σ') {
						w1.add("τσ");
						i ++;
					} else if (word.charAt(i + 1) == 'ζ') {
						w1.add("τζ");
						i ++;
					} else {
						w1.add("τ");
					}
				} else if (word.charAt(i) == 'γ' && word.charAt(i + 1) == 'κ') {
					w1.add("γκ");
					i ++;
				} else if (word.charAt(i) == 'γ' && word.charAt(i + 1) == 'γ') {
					w1.add("γγ");
					i ++;
				} else if (word.charAt(i) == 'ο' && ton != i) {
					if (word.charAt(i + 1) == 'ι' && !(dial == i + 1 || dialton == i + 1 )) {
						w1.add("οι");
						i ++;
					} else if (word.charAt(i + 1) == 'υ' && !( dial == i + 1 || dialton == i + 1)) {
						w1.add("oυ");
						i ++;
					} else {
						w1.add("ο");
					}
				} else if (word.charAt(i) == 'ε' && (ton != i)) {
					if (word.charAt(i + 1) == 'ι' && !(dial == i + 1 || dialton == i + 1)) {
						w1.add("ει");
						i ++;
					} else if ( word.charAt(i + 1) == 'υ' && !( dial == i + 1 || dialton == i + 1)) {
						w1.add("ευ");
						i ++;
					} else if (word.charAt(i + 1) == 'β') {
						w1.add("εβ");
						i ++;
					} else if (word.charAt(i + 1) == 'φ') {
						w1.add("εφ");
						i ++;
					} else {
						w1.add("ε");
					}
				} else if (word.charAt(i) == 'α' && (ton != i)) {
					if (word.charAt(i + 1) == 'ι' && !(dial == i + 1 || dialton == i + 1)) {
						w1.add("αι");
						i ++;
					} else if ( word.charAt(i + 1) == 'υ' && !( dial == i + 1 || dialton == i + 1)) {
						w1.add("αυ");
						i ++;
					} else if (word.charAt(i + 1) == 'β') {
						w1.add("αβ");
						i ++;
					} else if (word.charAt(i + 1) == 'φ') {
						w1.add("αφ");
						i ++;
					} else {
						w1.add("α");
					}
				} else {
					w1.add(Character.toString(word.charAt(i)));
				}
				i ++;
			}
		}catch (Exception e){
			w1.add(Character.toString(word.charAt(i)));
		}
		String [] w2 = new String[w1.size()];/*Η λίστα σε πίνακα (ο πίνακας βολεύει περισσότερο για να το μετατρέψουμε σε String*/
		for (int q = 0; q < w2.length; q++) {
			w2[q] = w1.get(q);
		}
		return w2;
	}
}
