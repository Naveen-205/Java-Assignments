package first.index;

public class Static_Instance {
	
	static String name = "Naveen";  // static variable
	
	//Instance variable
	int a = 5;
	int b = 2;
	
	void instance_var() {
		System.out.println("This is Instance Variable: " + a*b);
	}
	
	public static void main(String [] args) {
		// Accessing static variable directly using class name
		System.out.println("This is Static Variable: " + Static_Instance.name);
		
		Static_Instance obj = new Static_Instance();
		obj.instance_var();
	}
}
