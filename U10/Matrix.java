/**
 * @author jbrode2s
 */

import java.lang.String;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.*;

public class Matrix {
	private double[][] mtx;
	private int z;
	private int s;

	public Matrix(int z, int s) {
		if (z <= 0 || s <= 0) throw new IllegalArgumentException();
		
		mtx = new double[z][s];
		this.z = z;
		this.s = s;
		
		for (int i = 0; i < mtx.length; ++i) {
			for (int j = 0; j < mtx[0].length; ++j) {
				mtx[i][j] = 0.0;
			}
		}
	}

	public Matrix(int z) {
		this(z,z);
	}

	public Matrix(Matrix m) {
		if (m == null) {
			throw new NullPointerException();
		} else if (m.z <= 0 || m.s <= 0) {
			throw new IllegalArgumentException();
		} else {
			mtx = new double[m.z][m.s];
			this.z = m.z;
			this.s = m.s;
		}
		for (int i = 0; i < mtx.length; ++i) {
			for (int j = 0; j < mtx[0].length; ++j) {
				mtx[i][j] = m.mtx[i][j];
			}
		}
	}

	public int zeilen() {
		return this.z;
	}

	public int spalten() {
		return this.s;
	}

	public double get(int z, int s) {
		if (z < 0 || z > this.z - 1) throw new IllegalArgumentException();
		if (s < 0 || s > this.s - 1) throw new IllegalArgumentException();
		return mtx[z][s];
	}

	public Matrix set(int z, int s, double e) {
		if (z < 0 || z > this.z - 1) throw new IllegalArgumentException();
		if (s < 0 || s > this.s - 1) throw new IllegalArgumentException();
		mtx[z][s] = e;
		return this;
	}

	public Matrix setAll(double e) {
		for (int i = 0; i < mtx.length; ++i) {
			for (int j = 0; j < mtx[0].length; ++j) {
				mtx[i][j] = e;
			}
		}
		return this;
	}

	public Matrix setZeile(int z, double[] f) {
		if (f == null) throw new NullPointerException();
		if (z < 0 || z > this.z - 1) throw new IllegalArgumentException();
		if (f.length!= mtx[z].length) throw new IllegalArgumentException();
		
		for (int j = 0; j < mtx[0].length; ++j) {
			mtx[z][j] = f[j];
		}
		return this;
	}

	public Matrix setSpalte(int s, double[] f) {
		if (f == null) throw new NullPointerException();
		if (s < 0 || s > this.s - 1) throw new IllegalArgumentException();
		if (f.length != mtx.length) throw new IllegalArgumentException();
		
		for (int i = 0; i < mtx.length; ++i) {
			mtx[i][s] = f[i];
		}
		return this;
	}

	public boolean equals(Matrix m) {
		if (m == null) {
			throw new NullPointerException();
		}
		if (this.z == m.z && this.s == m.s) {
			for (int i = 0; i < mtx.length; ++i) {
				for (int j = 0; j < mtx[0].length; ++j) {
					if (!Mathe.equals(mtx[i][j], m.mtx[i][j])) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	public String toString() {
		String s = "( ";
		for (int i = 0; i < mtx.length; ++i) {
			for (int j = 0; j < mtx[0].length; ++j) {
				s +=  j != 0 ?   " " + mtx[i][j] : mtx[i][j];
			}
			s = s + " )\n";
			if (i < mtx.length - 1) {
				s = s + "( ";
			}
		}
		return s;
	}

	public Matrix eingabe(Scanner sc) {
		int a = mtx.length;
		int b = mtx[0].length;
		try {
			for (int i = 0; i < a; ++i) {
				if (!sc.next().equals("(")) {
					throw new InputMismatchException();
				}
				for (int j = 0; j < b; ++j) {
					mtx[i][j] = Double.parseDouble(sc.next());
				}
				if (!sc.next().equals(")")) {
					throw new InputMismatchException();
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace(System.out);
			throw new InputMismatchException();
		}
		catch(NoSuchElementException e) {
			throw new InputMismatchException();
		}

		return this;
	}
}
