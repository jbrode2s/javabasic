public class Zeichenkette {
	public static boolean isPalindromLoop(String s) {
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			char d = s.charAt(s.length() - i - 1);
			if (d != c) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindromRek(String s) {
		s = s.toLowerCase();
		char c = s.charAt(0);
		char d = s.charAt(s.length()-1);
		return isPalindromRekHelp(s, c, d);
	}

	private static boolean isPalindromRekHelp(String s, int pos, int pos2) {
		if(pos2 <= pos) return true;
		if(s.charAt(pos) != s.charAt(pos2)) return false;
		return isPalindromRekHelp(s, ++pos, --pos2);
	}
}