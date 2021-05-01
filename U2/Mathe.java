/*
*	@author jbrode2s
*/

public class Mathe {
	public static int abs(int zahl) {
		if (zahl < 0) {
			zahl = zahl * (-1);
			return zahl;
		} else {
			return zahl;
		}
	}
	
	public static int max3(int wert1, int wert2, int wert3) {
		if(wert1 < wert2)
		wert1 = wert2;
		if(wert1 < wert3) {
			return wert3;
		} else {
			return wert1;
		}
	}
	
	public static void quadOutRueck(int zahl) {
		int i = 1;
		int an = zahl;
		while ( i <= zahl) {
			System.out.println(an * an);
			i++;
			an--;
		}
	}
	
	public static int fak (int zahl) {
		int fakultaet = 1;
		for (int i = 1; i <= zahl; i++) {
			fakultaet = fakultaet * i;
		}
		return fakultaet;
	} 
	
	public static void ausgabeVielfache(int a, int n) {
		String erg = "";		
		for(int i = 1; i <= n; i++) {
			erg = erg + (a * i) + " ";
		}
		System.out.println(erg);
	}
	
	public static void ausgabe1x1(int n) {
		int i = 1;
		while(i <= n) {
			ausgabeVielfache(i, n);
			i++;
		}
	}
}
