package no.hvl.dat100;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveO2 {

	public static void main(String[] args) {
		int antallStudenter = 10;
		
		for (int i = 0; i < antallStudenter; i++) {
			int poengsum = (int)parseDouble(showInputDialog("Skriv inn poengsum (mellom 0 til 100) for studenten: "));

			do {
				poengsum = (int)parseDouble(showInputDialog("Ugyldig verdi! Skriv inn poengsum (mellom 0 til 100) for studenten: "));
			} while (poengsum < 0 || poengsum > 100);
			
			String karakter = "";

			if (poengsum < 40) {
				karakter = "F";
			} else if (poengsum < 50) {
				karakter = "E";
			} else if (poengsum < 60) {
				karakter = "D";
			} else if (poengsum < 80) {
				karakter = "C";
			} else if (poengsum < 90) {
				karakter = "B";
			} else {
				karakter = "A";
			}
			
			if (karakter != "") {
				showMessageDialog(null, "Studenten sin poengsum er " + poengsum + ", og det gir karakteren " + karakter);			
			} else {
				showMessageDialog(null, "Poengsummen er ugyldig! Det må være eit heltal mellom 0 og 100!");
			}
		}
	}

}
