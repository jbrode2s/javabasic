public class RationalTest {
	public static void main(String[] args) {
		// Test Parameter für Rational
		Rational r1 = new Rational(-15,6);
		Rational r2 = r1.abs();
		Rational r3 = new Rational(48,18);
		Rational r4 = new Rational(8,3);
		
		//Funktionstest
		System.out.println("1. Zaehler: " + r1.zaehler());
		System.out.println("1. Nenner: " + r1.nenner());
		System.out.println("2. Zaehler: " + r2.zaehler());
		System.out.println("2. Nenner: " + r2.nenner());
		System.out.println("3. Zaehler: " + r3.zaehler());
		System.out.println("3. Nenner: " + r3.nenner());
		System.out.println("4. Zaehler: " + r4.zaehler());
		System.out.println("4. Nenner: " + r4.nenner());
		System.out.println("-------------");
		System.out.println("Vergleiche!");
		System.out.println(r3.equals(r4));
		System.out.println(r1.equals(r2));
		System.out.println(r2.equals(r3));
		System.out.println("\nAddieren von Brüchen - Test!");
		System.out.println(r2.add(r3));
		System.out.println(r1.add(r2));
		System.out.println(r3.add(r4));
		System.out.println("\nSubtrahieren von Brüchen - Test!");
		System.out.println(r1.sub(r2));
		System.out.println(r1.sub(r4));
		System.out.println(r3.sub(r4));
		System.out.println(r2.sub(r4));
		System.out.println(r1.sub(r3));
		System.out.println("\nMultiplizieren von Brüchen - Test!");
		System.out.println(r1.mul(r2));
		System.out.println(r2.mul(r3));
		System.out.println("\nDividieren von Brüchen - Test!");
		System.out.println(r1.div(r2));
		System.out.println(r2.div(r3));
	}
}