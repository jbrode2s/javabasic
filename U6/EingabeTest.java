import java.util.Scanner;
import java.io.PrintStream;
public class EingabeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintStream ps = new PrintStream(System.out);
		System.out.println(Eingabe.filter(sc, ps, "/*","*/","//"));
		ps.close();
	}
}