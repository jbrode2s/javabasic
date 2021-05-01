public class MatheTest {
	public static void main(String[] args) {
		Mathe m = new Mathe();
		System.out.println("Test mit Additivem GGT");
		m.ggTAddOut(24,78);
		System.out.println("------------");
		m.ggTAddOut(124,178);
		System.out.println("\nTest mit Multiplikativen GGT");
		m.ggTMulOut(124,178);
		System.out.println("------------");
		m.ggTMulOut(24,78);
		System.out.println("\nTest mit Multiplikativen GGT (Betrag)");
		System.out.println(m.ggT(24,78));
	}
}