public class DatumTest{
	public static void main(String[] args) {
		DatumErweitert d1 = new DatumErweitert(2017,11,14);
		DatumErweitert d2 = new DatumErweitert(2018,11,14);
		System.out.println(d1.istFrueher(d2));
		d1.setFormatTZ('/');
		System.out.println(d1.toString());
		System.out.println(d2.toString());
	}
}