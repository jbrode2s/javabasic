/*
*	@author jbrode2s
*/
public class Datum {
	private int jahr;
	private int monat;
	private int tag;
	private static String formatRF = "jmt";
	private static char formatTZ = '-';
	
	public Datum() {
		jahr = 1;
		monat = 1;
		tag = 1;
	}
	
	public Datum(int jahr) {
		this.jahr = jahr;
		monat = 1;
		tag = 1;
	}
	
	public Datum(int jahr, int monat) {
		this.jahr = jahr;
		this.monat = monat;
		tag = 1;
	}
	
	public Datum(int jahr, int monat, int tag) {
		this.jahr = jahr;
		this.monat = monat;
		this.tag = tag;
	}
	
	public Datum(Datum datum) {
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
	
	public boolean equals(Datum datum) {
		if(jahr == datum.jahr && monat == datum.monat && tag == datum.tag) {
			return true;
		}
		return false;
	}
	
	public boolean istFrueher(Datum datum) {
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
	
	public String toString() {
		String out = "";
		String tagAusgabe = String.format("%02d", tag);
		String monatAusgabe = String.format("%02d", monat);
		
		if(formatRF == "jmt") {
			out = String.valueOf(jahr) + formatTZ + monatAusgabe + formatTZ + tagAusgabe;
		} else if (formatRF == "tmj") {
			out = tagAusgabe + formatTZ + monatAusgabe + formatTZ + String.valueOf(jahr);
		} else {
			out = monatAusgabe + formatTZ + tagAusgabe + formatTZ + String.valueOf(jahr);
		}
		return out;
	}
	
	public static void setFormatRF(String dar) {
		Datum.formatRF = dar;
	}
	
	public static void setFormatTZ(char zeichen) {
		Datum.formatTZ = zeichen;
	}
	
}