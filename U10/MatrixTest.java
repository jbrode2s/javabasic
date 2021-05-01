import java.util.*;

public class MatrixTest {
	public static void main(String[] args) {
		Matrix m = new Matrix(3);
		Scanner sc = new Scanner("( 1.0 2.0 3.0 )\n" + "( 2.0 1.0 3.0 )\n" + "( 3.0 2.0 1.0 )\n");
		m.eingabe(sc);
		System.out.println(m.toString());
		sc. close();
	}
}