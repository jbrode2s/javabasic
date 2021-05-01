/*
*@author jbrode2s
*/
public class Mathe {
	/* public static void ausgabeVielfache(int a, int n) {
	String erg = "";		
		for(int i = 1; i <= n; i++) {
			erg = erg + (a * i) + " ";
		}
		System.out.println(erg);
	}
	public static void ausgabe1x1(int n) {
		int wert1 = 1;
		int i = n;
		while(n > 0) {
			ausgabeVielfache(wert1, i);
			wert1++;
			n--;
		}
	} */
	
	public static int ggT(int a, int b) {
		return ggTMul(Math.abs(a),Math.abs(b));
	}
	
	public static int ggTAdd(int a, int b) {
		if(a == 0) {
			return b;
		}
		while(b > 0) {
			if(a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}
	
	public static int ggTMul(int a, int b) {
		if(b == 0) {
			return a;
		}
		int t = 0;
		while(b > 0) {
			t = a % b;
			a = b;
			b = t;
		}
		return a;
	}
	
	public static int ggTAddOut(int a, int b) {
		int count = 0;
		while(b > 0) {
			System.out.println(a + " " + b);
			if(a > b) {
				a -= b;
			} else {
				b -= a;
			}
			count++;
		}
		System.out.println(a + " " + b);
		return count;
	}
	
	public static int ggTMulOut(int a, int b) {
		int count = 0;
		int t = 0;
		while(b > 0) {
			System.out.println(a + " " + b);
			t = a % b;
			a = b;
			b = t;
			count++;
		}
		System.out.println(a + " " + b);
		return count;
	}
}
