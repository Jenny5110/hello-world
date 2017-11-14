public class Leksi {
	
	private int fonien;/*Μετρά πόσα φωνήεντα υπάρχουν χωρίς να μετράει τα φωνήεντα που έχουν τόνο ή διαλυτικά ή και τα δύο*/
	private int simfono;/*Μετρά πόσα σύμφωνα υπάρχουν*/
	private int tonos;/*Βρίσκει τη θέση του τόνου*/
	private int dialitika;/*Βρίσκει τη θέση των διαλυτικών*/
	private int dialtonos;/*Βρίσκει τη θέση των διαλυτικών με τόνο*/

	public Leksi(String lex) {
		this.fonien = 0;
		this.simfono = 0;
		this.tonos = -1; /*Έβαλα -1 γιατί το 0 αποτελεί θέση */ 
		this.dialitika = -1;
		this.dialtonos = -1;
		int count;
		String a;
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
			} else if (a.equals("ϊ") || a.equals("ϋ")) {
				this.dialitika = i;
			} else if (a.equals("ΐ") || a.equals("ΰ")) {
				this.dialtonos = i;
			} else {
				this.simfono ++;
			}
			
		}
	}
	
	public String toString(){
		return "FONIEN " + this.fonien + " SIMFONO " + this.simfono + " TONOS "+ this.tonos + " DIALITIKA " + this.dialitika + " DIALTONOS " + this.dialtonos ;
	}
}
