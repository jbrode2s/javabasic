/*
*	@author jbrode2s
*/

public class Zeichenkette {

	public static String grussMitZeit(int stunde, String name) {
		if(stunde < 12) {
			return "Guten Morgen, " + name + "!";
		} else if (stunde >= 18) {
			return "Guten Abend, " + name + "!";
		} else {
			return "Guten Tag, " + name + "!"; 
		}
	}

	public static String zitronenEis(int n) {
		String s = "";
		String z = "";
		
		if(n == 0)
		return "leckeres Zitroneneis";
		
		while(n > 0) {
			s = s + "super";
			z = z + "Z";
			n--;
		}
		return s + "leckeres " + z + "Zitroneneis";
	}

	public static void main(String[] args) {
		System.out.println(grussMitZeit(13, "Jonas"));
		System.out.println(grussMitZeit(8, "Jonas"));
		System.out.println(grussMitZeit(19, "Jonas"));
		
		System.out.println(zitronenEis(2));
		System.out.println(zitronenEis(3));
	}
}