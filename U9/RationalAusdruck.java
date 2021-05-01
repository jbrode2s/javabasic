import java.util.Scanner;

public class RationalAusdruck {
	
	public static Rational auswertung(Rational r1, char op, Rational r2) {
		switch(op) {
		case '+': return r1.add(r2);
		case '-': return r1.sub(r2);
		case '*': return r1.mul(r2);
		case '/': return r1.div(r2);
		default: throw new IllegalArgumentException("Ungueltige Eingabe, bitte Symbol einer Grundrechenart waehlen!");
		}
	}
	
	public static Rational next(Scanner sc) {
		Rational r1 = Rational.parse(sc.next());
		String op = sc.next();
		Rational r2 = Rational.parse(sc.next());
		return auswertung(r1,op.charAt(0),r2);
	}
	
	public static void dialog() {
		Scanner sc = new Scanner(System.in);
		Rational r = next(sc);
		System.out.println("= " + r);
		sc.close();
	}
}