/*
*@author jbrode2s
*/
import java.util.Scanner;
public class Messdaten {
	public static double temperaturInDurchschnitt(Scanner sc) {
		int jahrtemp = 0;
		int monattemp = 0;
		int tagtemp = 0;
		double messwertTemp = 0.0;
		double tempavg = 0.0;
		int count = 0;
		
		while(sc.hasNext()) {
			int jahr = sc.nextInt();
			int monat = sc.nextInt();
			int tag = sc.nextInt();
			String groesse = sc.next();
			double messwert = sc.nextDouble();
			
			if(groesse.equals("Temperatur")) {
				tempavg += messwert;
				count++;
				if(messwert > messwertTemp || messwert < 0.0 && messwert >= -273.15) {
					assert(messwert >= -274);
					messwertTemp = messwert;
					jahrtemp = jahr;
					monattemp = monat;
					tagtemp = tag;
				}
			}
		}
		System.out.println("hoechste Temperatur ("+ messwertTemp + ") am " + tagtemp + "." + monattemp + "." + jahrtemp);
		return tempavg / count;
	}
}