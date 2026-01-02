package first.index;

public class Instancevariables {
	int a = 56; // Instance variables
	int b; // Instance variables
	
	void show() {
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		
		Instancevariables obj = new Instancevariables();
		obj.show();//using method
		
		obj.b = 90;//using the field
		System.out.println("The value of object is "+obj.b);

	}

}
