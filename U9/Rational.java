/*
*@author jbrode2s
*/
public class Rational {
	int zaehler;
	int nenner;
	
	public Rational() {
		zaehler = 0;
		nenner = 1;
	}
	
	public Rational(int zahl) {
		this.zaehler = zahl;
		nenner = 1;
	}
	
	public Rational(int zaehler, int nenner) {
		if(nenner == 0) throw new ArithmeticException("Ungueltige Operation: Division durch 0 nicht möglich!");
		int ggt = Mathe.ggT(zaehler,nenner);
		this.zaehler = zaehler / ggt;
		this.nenner = nenner / ggt;
		if (this.nenner < 0) {
			this.nenner = -this.nenner;
			this.zaehler = -this.zaehler;
		}
	}
	
	public Rational(Rational r) {
		this.zaehler = r.zaehler;
		this.nenner = r.nenner;
	}
	
	public int zaehler() {
		return zaehler;
	}
	
	public int nenner() {
		return nenner;
	}
	
	public boolean equals(Rational r) {
		return this.zaehler == r.zaehler && this.nenner == r.nenner;		
	}
	
	public boolean istKleiner(Rational r) {
		return (this.zaehler * r.nenner < r.zaehler * this.nenner);
	}
	
	public Rational abs() {
		if (this.zaehler < 0) {
			return new Rational(this.zaehler * -1, this.nenner);
		} else {
			return new Rational(this.zaehler, this.nenner);
		}
	}
	
	public Rational rez() {
		return new Rational(this.nenner, this.zaehler);
	}
	
	public Rational add(Rational r2) {
		int i1 = this.zaehler * r2.nenner + r2.zaehler * this.nenner;
		int i2 = this.nenner * r2.nenner;
		return new Rational(i1,i2);
	}
	
	public Rational sub(Rational r2) {
		int i1 = this.zaehler * r2.nenner - r2.zaehler * this.nenner;
		int i2 = this.nenner * r2.nenner;
		return new Rational(i1,i2);
	}
	
	public Rational mul(Rational r2) {
		int i1 = this.zaehler * r2.zaehler;
		int i2 = this.nenner * r2.nenner;
		return new Rational(i1,i2);
	}
	
	public Rational div(Rational r2) {
		int i1 = this.zaehler * r2.nenner;
		int i2 = this.nenner * r2.zaehler;
		return new Rational(i1,i2);
	}
	
	public String toString() {
		return "" + this.zaehler + "/" + this.nenner;
	}
	
	public static Rational parse(String rs) {
		try {
			return new Rational(
			Integer.parseInt(rs.substring(0, rs.indexOf('/'))),
			Integer.parseInt(rs.substring(rs.indexOf('/') + 1)));
		}
		catch (IndexOutOfBoundsException e) { //falls Ungueltige Position
			throw new IllegalArgumentException("Ungueltige Position!");
		}
		catch (NumberFormatException e) { //falls Umwandlung von String zu Int nicht funkt. wegen unpassendem Format des String
			throw new IllegalArgumentException("Unlaessiges Format!");
		}
	}
}