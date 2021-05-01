public class Feld2 {
	public static int[] umkehren(int[] f) {
		int[] f2 = new int[f.length];
		int pos = f.length -1;
		
		for(int i = 0; i <= f2.length -1; i++) {
			f2[i] = f[pos];
			pos--;
		}
		return f2;
	}
	
	public static void umkehrenInPlace(int[] f) {
		int value = 0;
		for(int i = 0; i < f.length; i++) {
			if(i < f.length/2) {
				value = f[i];
				f[i] = f[f.length - (1 + i)];
				f[f.length - (1 + i)] = value;
			}
			System.out.println(f[i] + " ");
		}	
	}
}