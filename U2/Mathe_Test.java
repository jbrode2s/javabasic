public class Mathe_Test {
	public static void main(String[] args) {
		Mathe m = new Mathe();
		System.out.println("Invertierung aufheben");
		System.out.println("Zahl: " + m.abs(-5));
		System.out.println("Zahl: " + m.abs(5));
		System.out.println("Zahl: " + m.abs(-1));
		System.out.println("Zahl: " + m.abs(1));
		
		System.out.println("\nMAX3");
		System.out.println("Maximalwert: " + m.max3(-1,2,1));
		System.out.println("Maximalwert: " + m.max3(1,-2,-1));
		
		System.out.println("\nQuadrat");
		System.out.println("\n4 Quadrat");
		m.quadOutRueck(4);
		System.out.println("\n6 Quadrat");
		m.quadOutRueck(6);
		
		System.out.println("\nFakultaet");
		System.out.println(m.fak(4));
		System.out.println("\nVielfaches");
		m.ausgabeVielfache(3, 5);
		
		System.out.println("\nDas 1x1");
		System.out.println("5x5\n");
		m.ausgabe1x1(5);
		System.out.println("---------------");
		System.out.println("6x6\n");
		m.ausgabe1x1(6);
		System.out.println("---------------");
		System.out.println("3x3\n");
		m.ausgabe1x1(3);
	}
}