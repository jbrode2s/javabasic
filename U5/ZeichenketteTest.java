public class ZeichenketteTest {
	public static void main(String[] args) {
		System.out.println("Prüfung der Zeichenfolge!");
		System.out.println(Zeichenkette.istZiffernfolge("Hallo Welt!"));
		System.out.println(Zeichenkette.istZiffernfolge("123"));
		System.out.println("\nNamen auf ihre Schreibweise geprüft");
		System.out.println(Zeichenkette.istName("Johann Wolfgang"));
		System.out.println(Zeichenkette.istName("Brad-Arnold"));
		System.out.println(Zeichenkette.istName("eyyy"));
		System.out.println(Zeichenkette.istName("eyyy-"));
		System.out.println(Zeichenkette.istName(""));
		System.out.println("\nZaehlen der Buchstaben in einem String!");
		System.out.println(Zeichenkette.anzahlBuchstaben("Hallo Welt!"));
		System.out.println(Zeichenkette.anzahlBuchstaben(""));
		System.out.println(Zeichenkette.anzahlBuchstaben("A"));
		System.out.println("\nVokale werden vertauscht in Gross/Klein!");
		System.out.println(Zeichenkette.vokaleGross("Hallo Welt!"));
 		System.out.println("\nRueckwaerts!");
		System.out.println(Zeichenkette.rueckwaerts("Hallo Welt!"));
		System.out.println("\nEinfuegen!");
		System.out.println(Zeichenkette.einfuegung("Brot",2,"Käse"));
		System.out.println(Zeichenkette.einfuegung("Brot",0,"Käse")); 
	}
}