package first.index;

public class Default_Value {
	
	void default_local() {
		int a;
		int b;
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main (String [] args) {
		Default_Value obj = new Default_Value();
		obj.default_local();
	}
}
