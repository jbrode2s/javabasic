/*
*	@author jbrode2s
*/
import java.util.Scanner;
public class Interpreter {
	public static String verarbeite(Scanner sc) {
		String ausgabe = "";
		while(sc.hasNext()) {
			String position = sc.next();
			String zeichen = sc.next();
			String in = sc.next();
			String zeichenfolge = sc.next();
			
			boolean istZeichenEnthalten = false;
			
			if(zeichenfolge.contains(zeichen)) {
				istZeichenEnthalten = true;
			}
			
			if(position.equals("vor") && istZeichenEnthalten) {
				if(in.equals("in")) {
					System.out.println(zeichenfolge.substring(0, zeichenfolge.lastIndexOf(zeichen)));
					ausgabe = zeichenfolge.substring(0, zeichenfolge.lastIndexOf(zeichen));
				}
			}
			
			if(position.equals("nach") && istZeichenEnthalten) {
				if(in.equals("in")){
					System.out.println(zeichenfolge.substring(zeichenfolge.indexOf(zeichen) + 1));
					ausgabe = zeichenfolge.substring(zeichenfolge.indexOf(zeichen) + 1);
				}
			}
			
			if(position.equals("nach") && !istZeichenEnthalten) {
				if(in.equals("in")){
					System.out.println(zeichenfolge);
					ausgabe = zeichenfolge;
				}
			}
			
			if(position.equals("vor") && !istZeichenEnthalten) {
				if(in.equals("in")) {
					return "";
				}
			}
		}
		return ausgabe;
	}
}
