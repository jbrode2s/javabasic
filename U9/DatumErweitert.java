public class DatumErweitert {
	private int jahr;
	private int monat;
	private int tag;
	private static String formatRF = "jmt";
	private static char formatTZ = '-';
	
	public DatumErweitert() {
		this(1,1,1);
	}
	
	public DatumErweitert(int jahr) {
		this(jahr,1,1);
	}
	
	public DatumErweitert(int jahr, int monat) {
		this(jahr, monat, 1);
	}
	
	public DatumErweitert(int jahr, int monat, int tag) throws IllegalArgumentException{
		if(jahr < 1) throw new IllegalArgumentException("ungueltiger Wert fuer Jahr: " + jahr);
		if(monat < 1 || monat > 12) throw new IllegalArgumentException("ungueltiger Wert fuer monat: " + monat);
		if(tag < 1 || tag > tageInMonat(jahr, monat)) throw new IllegalArgumentException("ungueltiger Wert fuer Tag: " + tag);
		
		this.jahr = jahr;
		this.monat = monat;
		this.tag = tag;
	}
	
	public DatumErweitert(DatumErweitert datum) throws NullPointerException{
		if(datum == null) throw new NullPointerException();
		
		this.jahr = datum.jahr;
		this.monat = datum.monat;
		this.tag = datum.tag;
	}
	
	public int jahr() {
		return jahr;
	}
	
	public int monat() {
		return monat;
	}
	
	public int tag() {
		return tag;
	}
	
	public boolean equals(DatumErweitert datum) throws NullPointerException{
		if(datum == null) throw new NullPointerException();
		
		if(jahr == datum.jahr && monat == datum.monat && tag == datum.tag) {
			return true;
		}
		return false;
	}
	
	public boolean istFrueher(DatumErweitert datum) throws NullPointerException{
		if(datum == null) throw new NullPointerException();
		
		if(jahr < datum.jahr) {
			return true;
		} else if(jahr == datum.jahr) {
			if(monat < datum.monat) {
				return true;
			} else if(monat == datum.tag) {
				if(tag < datum.tag) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static String nameVonMonat(int monat) throws IllegalArgumentException{
		switch(monat) {
		case 1: return "Januar";
		case 2: return "Februar";
		case 3: return "Maerz";
		case 4: return "April";
		case 5: return "Mai";
		case 6: return "Juni";
		case 7: return "Juli";
		case 8: return "August";
		case 9: return "September";
		case 10: return "Oktober";
		case 11: return "November";
		case 12: return "Dezember";
		default:throw new IllegalArgumentException("Ungueltiger Wert fuer Monat: " + monat);
		}
	}
	
	public static int monatVonName(String monat) throws IllegalArgumentException{
		switch(monat) {
		case "Januar": return 1;
		case "Februar": return 2;
		case "Maerz": return 3;
		case "April": return 4;
		case "Mai": return 5;
		case "Juni": return 6;
		case "Juli": return 7;
		case "August": return 8;
		case "September": return 9;
		case "Oktober": return 10;
		case "November": return 11;
		case "Dezember": return 12;
		default:throw new IllegalArgumentException("Ungueltiger Wert fuer Monat: " + monat);
		}
	}
	
	public String toString() {
		String out = "";
		String tagAusgabe = String.format("%02d", tag);
		String monatAusgabe = "";
		
		if(formatTZ == 'O') {
			monatAusgabe = nameVonMonat(monat);
			if(formatRF == "jmt") {
				out = String.valueOf(jahr) + " " + monatAusgabe + " " + tagAusgabe;
			} else if (formatRF == "tmj") {
				out = tagAusgabe + " " + monatAusgabe + " " + String.valueOf(jahr);
			} else {
				out = monatAusgabe + " " + tagAusgabe + " " + String.valueOf(jahr);
			}
		} else {
			monatAusgabe = String.format("%02d", monat);
			if(formatRF == "jmt") {
				out = String.valueOf(jahr) + formatTZ + monatAusgabe + formatTZ + tagAusgabe;
			} else if (formatRF == "tmj") {
				out = tagAusgabe + formatTZ + monatAusgabe + formatTZ + String.valueOf(jahr);
			} else {
				out = monatAusgabe + formatTZ + tagAusgabe + formatTZ + String.valueOf(jahr);
			}
		}
		return out;
	}
	
	public static int tageInMonat(int jahr, int monat) throws IllegalArgumentException{
		switch(monat) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: return 31;
		case 4:
		case 6:
		case 9:
		case 11: return 30;
		case 2: if(istSchaltjahr(jahr)) return 29; else return 28;
		default:throw new IllegalArgumentException("Ungueltiger Wert fuer Monat: " + monat);
		}
	}
	
	public static boolean istSchaltjahr(int jahr) throws IllegalArgumentException{
		if(jahr < 1) throw new IllegalArgumentException("Ungueltiger Wert fuer Jahr: " + jahr);
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
	
	public static void setFormatRF(String dar) throws IllegalArgumentException{
		if((dar.equals("jmt")) || (dar.equals("tmj")) || (dar.equals("mtj"))){
			DatumErweitert.formatRF = dar;
		} else {
			throw new IllegalArgumentException("ungueltiger Wert fuer Format-Reihenfolge: " + '\"' + dar + '\"');
		}
	}
	
	public static void setFormatTZ(char zeichen){
		DatumErweitert.formatTZ = zeichen;
	}
}