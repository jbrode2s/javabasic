public class KontaktMitIfElse {
	public static String gruss (String Sprache, String name) {
		String gruss;
		if(Sprache.equals("Englisch")) {
			gruss = "Hello";
		} else {
			gruss = "Hallo";
		}
		return gruss + " " + name + "!";
	}

	public static void main (String[] args) {
		System.out.println(gruss("Englisch", "Jonas"));
		System.out.println(gruss("Deutsch", "Jonas"));
	}
}
