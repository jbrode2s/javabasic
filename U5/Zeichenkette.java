/*
*	@author jbrode2s
*/
public class Zeichenkette {
	public static boolean istZiffernfolge(String kette) {
		int z = 0;
		while(z < kette.length() - 1) {
			char c = kette.charAt(z);
			if(Character.isDigit(c)==false){
				return false;
			}
			z++;
		}
		return true;
	}

	public static boolean istName(String name) {
		int z = 0;
		char c;

		if(name.length() > 1) {
			if (name.charAt(0) == '-' || name.charAt(name.length()-1) == '-'){
				return false;
			}
		}

		while(z <= name.length() - 1) {
			c = name.charAt(z);
			if(Character.isLetter(c) == false && c != '-') {
				return false;
			}
			z++;
		}
		return true;
	}

	public static int anzahlBuchstaben(String buchstaben) {
		int z = 0;
		int anzahl = 0;
		while(z < buchstaben.length()) {
			char c = buchstaben.charAt(z);
			if(Character.isLetter(c)== true) {
				anzahl++;
			}
			z++;
		}
		return anzahl;
	}

	public static String vokaleGross(String kette) {
		return kette.toLowerCase().replace('a', 'A')
		.replace('e', 'E')
		.replace('i', 'I')
		.replace('o', 'O')
		.replace('u', 'U');
	}

	public static String rueckwaerts(String kette) {
		int z = kette.length() -1;
		String ausgabe = "";
		while(z >= 0) {
			char c = kette.charAt(z);
			ausgabe += c;
			z--;
		}
		return ausgabe;
	}

	public static String einfuegung(String s, int p, String t) {
		return s.substring(0, p) + t + s.substring(p);
	} 
}
