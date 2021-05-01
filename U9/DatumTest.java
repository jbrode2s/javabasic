public class DatumTest{
	public static void main(String[] args) {
		DatumErweitert d1 = new DatumErweitert(2017,11,14);
		DatumErweitert d2 = new DatumErweitert(2018,11,14);
		DatumErweitert d3 = new DatumErweitert();
		System.out.println(d1.istFrueher(d2));
		d1.setFormatRF("tmj");
		d1.setFormatTZ('O');
		System.out.println(d1.toString());
		d2.setFormatTZ('/');
		System.out.println(d2.toString());
		System.out.println(d1.equals(null)); //NullPointerException
	}
}