public class TestFeld {
	public static void main(String[] args) {
		int[] f = {1,1,1,1};
		int[] d = {1,2,3,4};
		int[] e = {2,5,2,1};
		
		System.out.println("Testen ob Felder Homogen");
		System.out.println(Feld.istHomogen(f));
		System.out.println(Feld.istHomogen(d));
		System.out.println(Feld.istHomogen(e));
		
		System.out.println("Testen ob Felder sortiert");
		System.out.println(Feld.istSortiert(f));
		System.out.println(Feld.istSortiert(d));
		System.out.println(Feld.istSortiert(e));
		
		System.out.println("Testen wo maximale Position");
		System.out.println(Feld.maxPos(f));
		System.out.println(Feld.maxPos(d));
		System.out.println(Feld.maxPos(e));
		
		System.out.println("Testen wo maximales Element");
		System.out.println(Feld.maxElement(f));
		System.out.println(Feld.maxElement(d));
		System.out.println(Feld.maxElement(e));
		
		System.out.println("Testen wo maximales Element in 2 Feldern");
		int[] h = Feld.max(d, e);
		for(int i = 0; i < f.length; i++){
			System.out.println(h[i]);
		}
		
		System.out.println("-------------------");
		int[] g = Feld2.umkehren(d);
		for(int i = 0; i < d.length; i++){
			System.out.print(g[i] + " ");
		}
		System.out.println("\n");
		System.out.println("-------------------");
		Feld2.umkehrenInPlace(d);
	}
}