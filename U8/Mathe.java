public class Mathe{
	public static int addLoop(int a, int b) {
		if (b < 0)  return subLoop(a, -b);
		else {
			for (int i = 0; i < b; i++) {
				++a;
			}
		}
		return a;
	}
	
	public static int subLoop(int a, int b) {
		if (b < 0) return addLoop(a, -b);
		else {
			for (int i = 0; i < b; i++) {
				--a;
			}
		}
		return a;
	}
	
	public static int mulLoop(int a, int b) {
		if (a < 0) return -mulLoop(-a, b);
		int tmp = 0;
		for (int i = 0; i < a; i++){
			tmp = addLoop(tmp, b);
		}
		return tmp;
	}
	
	public static int divLoop(int a, int b) {
		if (a < 0) return -divLoop(-a, b);
		if (b < 0) return -divLoop(a, -b);
		int count = 0;
		for(int i = 0; a >= b; i++) {
			a = subLoop(a,b);
			count++;
		}
		return count;
	}
	
	public static int modLoop(int a, int b) {
		if (a < 0) return -modLoop(-a, b);
		if (b < 0) return modLoop(a, -b);
		while(a >= b){
			a = subLoop(a, b);
		}
		return a;
	}
	
	public static int powLoop(int a, int b) {
		int aus = 1;
		for (int i = 0; i < b; i++){
			aus = mulLoop(aus, a);
		}
		return aus;
	}
	
	public static int addRek(int a, int b) {
		if(b < 0) {
			return subRek(a,-b);
		} else {
			return addRek(a, b, 0);
		}
	}
	
	private static int addRek(int a, int b, int i){
        return i >= b ? a : addRek(++a, b, ++i);
    }
	
	public static int subRek(int a, int b) {
		if(b < 0) {
			return addRek(a, -b);
		} else {
			return subRek(a, b, 0);
		}
	}
	
	private static int subRek(int a, int b, int i){
        return i >= b ? a : subRek(--a, b, ++i);
    }
	
	public static int mulRek(int a, int b) {
		if ( a < 0) {
			return -mulRek(-a,b);
		} else {
			return mulRek(a, b, 0, 0);
		}
	}
	
	private static int mulRek(int a, int b, int i, int j){
        return i >= a ? j : mulRek(a, b, ++i, addRek(j, b));
    }
	
	public static int divRek(int a, int b) {
		if (a < 0)return -divRek(-a, b);
		if(b < 0) return -divRek(a, -b); 
		return rdivRek(a, b, 0);
	}
	
	private static int divRek(int a, int b, int i){
        return a < b ? i : divRek(subRek(a, b), b, ++i);
    }
	
	public static int modRek(int a, int b) {
		if(a < 0) return -modRek(-a, b);
		if(b < 0) return modRek(a, -b);
		return modRek(a, b, 0);
	}
	
	private static int modRek(int a, int b, int i){
        return a < b ? a : modRek(subRek(a, b), b, ++i);
    }
	
	public static int powRek(int a, int b) {
		return powRek(a, b, 0, 1);;
	}
	
	private static int powRek(int a, int b, int i, int aus){
        return i >= b ? aus : powRek(a, b, ++i, mulRek(aus, a));
    }
}