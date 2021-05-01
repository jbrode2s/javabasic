public class Mathe_Test {
	public static void main(String[] args){
		int a = 5;
		int b = 3;
		int c = 6;
		int d = 12;
		
		System.out.println(Mathe.addLoop(a,b));
		System.out.println(Mathe.subLoop(a,b));
		System.out.println(Mathe.mulLoop(a,b));
		System.out.println(Mathe.divLoop(d,c));
		System.out.println(Mathe.modLoop(a,b));
		System.out.println(Mathe.powLoop(3,2));
		
		System.out.println("--------------------");
		System.out.println("Rekursive Methoden");
		System.out.println("--------------------");
		
		System.out.println(Mathe.addRek(a,b));
		System.out.println(Mathe.subRek(a,b));
		System.out.println(Mathe.mulRek(a,b));
	}
}