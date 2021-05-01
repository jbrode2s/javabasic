/*
*@author jbrode2s
*/
import java.util.Scanner;
import java.io.PrintStream;
public class Eingabe {
	public static int filter(Scanner sc, PrintStream ps, String start, String stop, String skip) {
		String ausgabe = "";
		int count = 0;
		
		while(sc.hasNext()) {
			String eingabe = sc.next();
			if(eingabe.equals(start)) {
				while(sc.hasNext()&& !eingabe.equals(stop)) {
					eingabe = sc.next();
				}
			} else if(eingabe.equals(skip)) {
				eingabe = sc.nextLine();
			} else {
				ausgabe += eingabe + " ";
				count++;
			}
		}
		ps.println(ausgabe);
		return count;
	}
}