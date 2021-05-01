import java.util.Scanner;

public class SWIFT {
	public static String bankleitzahl(int blz) {
		return "" + blz;
	}
	
	public static String bban(int blz, long knr) {
		return bankleitzahl(blz) + kontonummer(knr);
	}
	
	public static String landeskuerzel(String zeichen) {
		if(zeichen.length() > 2) 
			throw new IllegalArgumentException("Fehler bei der laenge des Laenderkuerzels!");
		return zeichen.toUpperCase();
	}
	
	public static int zahlFuerUpper(char lk) {
		if ((lk - 'A') < 0 || (lk - 'Z') > 25)
			throw new IllegalArgumentException();
		return lk - 'A' + 10;
	}

	public static String kontonummer(long knr) {
		String value = "" + knr;
		while (value.length() < 10) {
			value = "0" + value;
		}
		return value;
	}
	
	public static String bbanErgaenzung(String lk) {
		if(lk.length() > 2) throw new IllegalArgumentException();
		return zahlFuerUpper(lk.charAt(0)) + zahlFuerUpper(lk.charAt(1)) + "00";
	}
	
	public static int zahlAlsStringMod97(String bban) {
		int count = 0;
		do {
			if (bban.length()>9) {
				count = Integer.parseInt(bban.substring(0,9)); 
				bban = bban.substring(9);
			} else {
				count = Integer.parseInt(bban);
				bban = "";
			}
			count = count % 97;
			System.out.println(count);
			bban = count + bban;
		} while (Long.parseLong(bban)>=97);
		return count;
	}	
	
	public static String pruefzahl(String bban, String lk) {
		int pruefziffer = 98 - zahlAlsStringMod97(bban + bbanErgaenzung(landeskuerzel(lk)));
		if (pruefziffer <= 10) {
			return "0" + pruefziffer;
		}
		
		return "" + pruefziffer;
	}
	
	public static String iban(String laenderkennung, int blz, long nummer) {
		String knrBlz = kontonummer(nummer) + bankleitzahl(blz);
		return landeskuerzel(laenderkennung) + pruefzahl(bban(blz,nummer),laenderkennung) + knrBlz;
	}
}




