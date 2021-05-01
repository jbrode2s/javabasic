import java.util.Scanner;

public class GeometrieTest2 {
	public static void test(Scanner sc) {
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			String str = sc.next();
			
			if (str.equals("Flaeche")){
				System.out.println(Geometrie.flaecheREck(a,b));
			}
			else if (str.equals("Umfang")){
				System.out.println(Geometrie.umfangREck(a,b));
			}
			else{
				System.out.println("Falsche Eingabe!");
			}	
		}
	}
}