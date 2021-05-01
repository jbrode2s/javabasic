public class Feld {
	public static boolean istHomogen(int[] f) {
		//if(f.length == 0) return true;
		for(int i  = 0; i <= f.length -1; i++) {
			if(f[0] != f[i]) return false;
		}
		return true;
	}
	
	public static boolean istSortiert(int[] f) {
		/* if(f.length == 0) return true; */
		for(int i  = 0; i < f.length -1; i++) {
			if(f[i] > f[i + 1]) return false;
		}
		return true;
	}
	
	public static int maxPos(int[] f) {
		if (f.length == 0) {
			throw new IllegalArgumentException("Illegal Argument Exception!");
		}
		int max = f[0];
		int position = 0;
		for(int i  = 1; i < f.length; i++) {
			if(f[i] > max) {
				max = f[i];
				position = i;
			}
		}
		return position;
	}
	
	public static int maxElement(int[] f) {
		if (f.length == 0) {
			throw new IllegalArgumentException("Illegal Argument Exception!");
		}
		int max = f[0];
		for(int i  = 1; i < f.length; i++) {
			if(f[i] > max) {
				max = f[i];
			}
		}
		return max;
	}
	
	public static int[] max(int[] f1, int[] f2) {
		if (f1 == null | f2 == null) {
			throw new NullPointerException("null!");
		}
		if (f1.length != f2.length) {
			throw new IllegalArgumentException("Illegal Argument Exception!");
		}
		
		int[] f3 = new int[f1.length];
		
		for(int i = 0; i < f1.length; i++) {
			if(f1[i] > f2[i]) {
				f3[i] = f1[i];
			} else {
				f3[i] = f2[i];
			}
		}
		return f3;
	}
}