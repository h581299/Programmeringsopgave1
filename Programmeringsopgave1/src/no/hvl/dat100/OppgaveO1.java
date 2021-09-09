package no.hvl.dat100;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		// Programmet tar bare imot heltal. Alle flytal brukeren skriver blir omgjort til heltal
		int bruttoinntekt = (int)parseDouble(showInputDialog("Skriv inn bruttoinntekt: "));
		
		double trinnskatt = 0.0;
		
		// Verdien for trinnskatt hentet fra https://www.skatteetaten.no/satser/trinnskatt/?year=2021#rateShowYear
		if (bruttoinntekt < 184000) {
			trinnskatt = 0.00;
		} else if (bruttoinntekt < 261100) {
			trinnskatt = 1.7;
		} else if (bruttoinntekt < 651250) {
			trinnskatt = 4.0;
		} else if (bruttoinntekt < 1021550) {
			trinnskatt = 13.2;
		} else {
			trinnskatt = 16.2;
		}
		
		// Viser at trinnskatt prosenten er rett
		showMessageDialog(null, "Trinskatt med bruttoinntekt av " + bruttoinntekt + " er " + trinnskatt + "%");

		double trinnskattSum = bruttoinntekt / 100 * trinnskatt;

		// Viser kor mye som ble tatt i trinnskatt
		showMessageDialog(null, "Det betyr at det blir tatt " + trinnskattSum + " kr i trinnskat");

	}

}
