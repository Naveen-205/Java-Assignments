package first.index;

public class StaticVariable_StaticMethod {
	
	static int add(int a,int b)//static method
	{
		return a+b;
	}
	
	static int multiply(int a,int b) //static method
	{
		return a*b;
	}

	public static void main(String[] args) {
		
		int sum = StaticVariable_StaticMethod.add(8, 9);
		
		int product = StaticVariable_StaticMethod.multiply(8,9);
		
		System.out.println("Sum " + sum);
		System.out.println("Product " + product);

	}

}
