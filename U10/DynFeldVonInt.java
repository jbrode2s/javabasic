public class DynFeldVonInt {
	private int[] feld;
	public DynFeldVonInt(int a) {
		if(a < 0) throw new IllegalArgumentException("Illegal Argument Exception!");
		feld = new int[a];
	}
	
	public int length() {
		return feld.length;
	}
	
	public int get(int i){
		return feld[i];
	}
	
	public void set(int i, int v) {
		feld[i] = v;
	}
	
	public void insert(int i, int k) {
		if(k < 0) throw new IllegalArgumentException("Illegal Argument Exception!");
		
		int[] neuesFeld = new int[feld.length + k];
		
		for(int j = 0; j < i; j++) {
			neuesFeld[j] = feld[j];
		}
		
		for(int x = 0; x < feld.length -1;x++) {
			neuesFeld[i + k + x] = feld[i + x];
		}
		feld = neuesFeld;
	}
	
	public void remove(int i, int k) {
		if(k < 0) throw new IllegalArgumentException("Illegal Argument Exception!");
		
		int[] neuesFeld = new int[feld.length - k];
		
		if(neuesFeld.length == 0) throw new IndexOutOfBoundsException("Leeres Feld!");
		
		for(int j = 0; j < i; j++) {
			neuesFeld[j] = feld[j];
		}
		
		for(int x = 0; x < feld.length - i - k;x++) {
			neuesFeld[i + x] = feld[i + k + x];
		}
		feld = neuesFeld;
	}
	
	public boolean equals(DynFeldVonInt d) {
		if(this.length() != d.length()) return false;
		
		for(int i = 0; i < this.length(); i++) {
			if(feld[i] != d.feld[i]) return false;
		}
		
		return true;
	}
	
	public String toString() {
		String ausgabe = "";
		for(int i = 0; i < length(); i++) {
			if(i != feld.length -1)ausgabe += feld[i] + ",";
			else ausgabe += feld[i];
		}
		return "[" + ausgabe + "]";
	}
}