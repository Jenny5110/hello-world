public class Leksi {
	
	private int fonien;/*Μετρά πόσα φωνήεντα υπάρχουν χωρίς να μετράει τα φωνήεντα που έχουν τόνο ή διαλυτικά ή και τα δύο*/
	private int simfono;/*Μετρά πόσα σύμφωνα υπάρχουν*/
	private int tonos;/*Βρίσκει τη θέση του τόνου*/
	private int dialitika;/*Βρίσκει τη θέση των διαλυτικών*/
	private int dialtonos;/*Βρίσκει τη θέση των διαλυτικών με τόνο*/
        private StringBuffer raw;/*Δημιουργεί τη λέξη χωρις τόνους ή διαλυτικά με μικρά*/
	private StringBuilder lower;/*ότι κεφαλάιο βρει στη λέξη το κάνει μικρό*/

	public Leksi(String lex) {
		this.fonien = 0;
		this.simfono = 0;
		this.tonos = -1; /*Έβαλα -1 γιατί το 0 αποτελεί θέση */ 
		this.dialitika = -1;
		this.dialtonos = -1;
		int count;
		String a;
		this.lower = new StringBuilder(lex);
		for (int index = 0; index < lower.length(); index++) {
		    char c = lower.charAt(index);
		    if (Character.isUpperCase(c)) {
		        lower.setCharAt(index, Character.toLowerCase(c));
		    }
		}
		lex = lower.toString();
		this.raw = new StringBuffer(lex);
		for (int i=0;i < lex.length(); i++){
			count = i;
			a = lex.substring(count, count+1);
			if (a.equals("α") || a.equals("ε") || a.equals("η") || a.equals("ι") || a.equals("υ") || a.equals("ο") ||
					a.equals("ω") || a.equals("Α") || a.equals("Ε") || a.equals("Η") || a.equals("Ι") || a.equals("Υ") || 
					a.equals("Ο") || a.equals("Ω")){
				this.fonien ++;
			} else if (a.equals("ά") || a.equals("έ") || a.equals("ή") || a.equals("ί") || a.equals("ύ") || a.equals("ό") ||
					a.equals("ώ") || a.equals("Ά") || a.equals("Έ") || a.equals("Ή") || a.equals("Ί") || a.equals("Ύ") || 
					a.equals("Ό") || a.equals("Ώ")){
				this.tonos = i;
				if (a.equals("ά")){
					this.raw.replace(i, i+1, "α");
				} else if (a.equals("έ")){
					this.raw.replace(i, i+1, "ε");
				} else if (a.equals("ή")){
					this.raw.replace(i, i+1, "η");
				} else if (a.equals("ί")){
					this.raw.replace(i, i+1, "ι");
				} else if (a.equals("ύ")){
					this.raw.replace(i, i+1, "υ");
				} else if (a.equals("ό")){
					this.raw.replace(i, i+1, "ο");
				} else {
					this.raw.replace(i, i+1, "ω");
				}
			} else if (a.equals("ϊ") || a.equals("ϋ")) {
				this.dialitika = i;
				if (a.equals("ϊ")){
					this.raw.replace(i,  i+1,  "ι");
				} else {
					this.raw.replace(i,  i+1, "υ");
				}
			} else if (a.equals("ΐ") || a.equals("ΰ")) {
				this.dialtonos = i;
				if (a.equals("ΐ")){
					this.raw.replace(i,  i+1,  "ι");
				} else {
					this.raw.replace(i,  i+1, "υ");
				}
			} else {
				this.simfono ++;
			}
			
		}
	}
	
	public void setFonien(int fonien) {
		this.fonien = fonien;
	}
	
	public int getFonien() {
		return this.fonien;
	}
	
	
	
	public void setSimfono(int simfono) {
		this.simfono = simfono;
	}
	
	public int getSimfono() {
		return this.simfono;
	}
	
	
	
	public void setTonos(int tonos) {
		this.tonos = tonos;
	}
	
	public int getTonos() {
		return this.tonos;
	}
	
	
	
	public void setDialitika(int dialitika) {
		this.dialitika = dialitika;
	}
	
	public int getDialitika() {
		return this.dialitika;
	}
	
	
	
	public void setDialtonos(int dialtonos) {
		this.dialtonos = dialtonos;
	}
	
	public int getDialtonos() {
		return this.dialtonos;
	}
	
	
	
	public void setRaw(StringBuffer raw) {
		this.raw = raw;
	}
	
	public StringBuffer getRaw() {
		return this.raw;
	}
	
	public String toString(){
		return "FONIEN " + this.fonien + " SIMFONO " + this.simfono + " TONOS "+ this.tonos + " DIALITIKA " + this.dialitika + " DIALTONOS " + this.dialtonos ;
	}
}
