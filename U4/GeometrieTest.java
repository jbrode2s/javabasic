/**
 * @author apries2m
 */
public class GeometrieTest {
  public static boolean flaecheREckCheck(double a, double b, double erw) {
    double erg = Geometrie.flaecheREck(a, b);
    boolean istKorrekt = Mathe.equals(erg, erw);
    if (!istKorrekt) {
      System.out.println("FEHLER: flaecheREck(" + a + "," + b + ")=="
                         + erg + " statt " + erw);
    }
    return erg == erw;
  }
  public static boolean umfangREckCheck(double a, double b, double erw) {
    double erg = Geometrie.umfangREck(a, b);
    boolean istKorrekt = Mathe.equals(erg, erw);
    if (!istKorrekt) {
      System.out.println("FEHLER: umfangREck(" + a + "," + b + ")=="
                         + erg + " statt " + erw);
    }
    return istKorrekt;
  }
  public static boolean flaecheREckTest() {
    return flaecheREckCheck(5.0, 7.0, 35.0)
	& flaecheREckCheck(10.0, 14.0, 140.0)
	& flaecheREckCheck(10.0, 14.0, 70.0); //Ein beabsichtiger Fehler, um auch die Ausgabe eines Fehlers zu testen
  }
  public static boolean umfangREckTest() {
    return umfangREckCheck(5.0, 7.0, 24.0)
	& umfangREckCheck(10.0, 14.0, 48.0);
  }
  public static boolean test() {
    return flaecheREckTest()
         & umfangREckTest();
  }
  
  public static void main(String[] args) {
	  test();
  }
}
