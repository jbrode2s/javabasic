/*
*@author jbrode2s
*/

public class Datum {
	public static boolean istSchaltjahr(int jahr){
		if(jahr < 1583) {
			if(jahr % 4 == 0) {
			return true;
			} else { 
			return false;
			}
		} else {
			if(jahr%4 == 0 && (jahr%100 != 0 || jahr%400 == 0)) {
				return true;
			} else {
				return false;
			}
		}
	}
}
