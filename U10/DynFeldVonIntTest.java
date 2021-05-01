public class DynFeldVonIntTest{
	public static void main(String[] args) {
		DynFeldVonInt feld = new DynFeldVonInt(3);
		feld.set(0,3);
		feld.set(1,7);
		feld.set(2, -1);
		System.out.println(feld);
		feld.insert(1,2);
		System.out.println(feld);
		feld.set(2,5);
		feld.set(1,-3);
		System.out.println(feld);
		feld.remove(2,3);
		System.out.println(feld);
		feld.remove(1,2);
		System.out.println(feld);
	}
}