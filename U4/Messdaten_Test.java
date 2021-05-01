import java.util.Scanner;
public class Messdaten_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Messdaten md = new Messdaten();
		System.out.println(md.temperaturInDurchschnitt(sc));
		sc.close();
	}
}