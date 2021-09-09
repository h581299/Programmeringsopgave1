package no.hvl.dat100;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

	/**
	 * Metoden vil finne fakulteten av tallet brukeren legger inn.
	 * 
	 * Største problemstillingen her er kor høgt denne verdien blir. Ein vanlig
	 * "int" kan ikkje lagre eit nummer "2,147,483,647". Til og med ein variable
	 * med data typen long kan ikkje lagre fakulteten av eit nummer så lavt som 30.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int tall = 0;

		do {
			tall = (int)parseDouble(showInputDialog("Skriv inn eit heltal høyere ein 0: "));
		} while (tall <= 0);

		long fakultet = 1;
		
		for (int i = 1; i <= tall; i++) {
			fakultet = fakultet * i;
		}
		
		showMessageDialog(null, "Verdien av tallet ditt i fakultet er: " + fakultet);
	}

}
