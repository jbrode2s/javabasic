/*
*@author jbrode2s
*/
import java.util.Scanner;
public class Eingabe {
	public static double durchschnitt(Scanner sc) {
		int count = 0;
		double value = 0.0;
		if(!sc.hasNextDouble()) {
			return 0.0;
		} else {
			while(sc.hasNextDouble()) {
				value += sc.nextDouble();
				count++;
			}
		}
		sc.close();
		return value / count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(durchschnitt(sc));
		sc.close();
	}
}