public class Zeichenkette2 {
	public static String rueckwaerts(String argument) {
		String output = "";
		for (int i = 0; i < argument.length(); i++) {
			output = argument.charAt(i) + output;
		}
		return output;
	}
	
	public static String einfuegung(String s, int p, String t) {
		String s1 = s.substring(0,p);
		String s2 = s.substring(p, s.length());
		String erg = s1 + t + s2;

		return erg;
	}
}