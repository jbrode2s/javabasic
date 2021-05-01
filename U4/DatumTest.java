/*
*@author jbrode2s
*/
public class DatumTest {
	public static boolean schaltjahrCheck(int jahr, boolean chk) {
		boolean chkValue = Datum.istSchaltjahr(jahr);
		if (chk != chkValue) {
			System.out.println("Erwartet wurde " + chk + "\nErgebnis ist " + chkValue+ "\nfür das Jahr " + jahr + "\n");
			return false;
		}
		return true;
	}
	public static boolean schaltjahrTest() {
		return schaltjahrCheck(2016, true)    // durch 4 teilbar
		& schaltjahrCheck(2018, false)   // nicht durch 4 teilbar
		& schaltjahrCheck(2000, true)    // durch 4 und 400 teilbar

		& schaltjahrCheck(120, true)     // ! durch 4 teilbar
		& schaltjahrCheck(361, false)    // ! nicht durch 4 teilbar

		& schaltjahrCheck(1584, true)    // durch 4 teilbar
		& schaltjahrCheck(1700, false)   // ! durch 4 und 100 teilbar
		& schaltjahrCheck(1600, true)    // durch 4 und 400 teilbar
		& schaltjahrCheck(2003, false)   // nicht durch 4 teilbar

		& schaltjahrCheck(1, false)
		& schaltjahrCheck(3, false)
		& schaltjahrCheck(4, true)
		& schaltjahrCheck(400, true)
		& schaltjahrCheck(500, true);
	}
	public static boolean test() {
		return schaltjahrTest();
	}
	public static void main(String[] args) {
		test();
	}
}
