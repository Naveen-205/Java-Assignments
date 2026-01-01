package first.index;

public class Swap {
	public static void main(String[] args) {
		int a = 6 , b = 7;
		System.out.println("a = " + a + " b = " + b);
		a = a+b;
//		System.out.println(a);
		b = a-b;
//		System.out.println(b);
		a = a-b;
//		System.out.println(a);
		System.out.println("a = " + a + " b = " + b);
	}
}
