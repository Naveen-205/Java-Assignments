package first.index;

public class Variables_Together {
	
	    // Instance variable (belongs to each object)
	    int instanceVar = 10;

	    // Static variable (shared across all objects of the class)
	    static String staticVar = "I am static";

	    void showVariables() {
	        // Local variable (declared inside a method)
	        int localVar = 5;

	        System.out.println("Instance Variable: " + instanceVar);
	        System.out.println("Static Variable: " + staticVar);
	        System.out.println("Local Variable: " + localVar);
	    }

	    public static void main(String[] args) {
	        // Creating object
	    	Variables_Together obj1 = new Variables_Together();
	        obj1.showVariables();

	        // Accessing static variable directly using class name
	        System.out.println("Accessing Static Variable via class: " + Variables_Together.staticVar);
	    
	}
}
