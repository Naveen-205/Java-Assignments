package first.index;

public class ParameterVariable {
	void add(int a,int b) //parameter variable  //(int a,int b)method signature
	{
		int sum = a+b; //local variable
		System.out.println("Sum: " + sum);
	}

	public static void main(String[] args) {
		ParameterVariable obj = new ParameterVariable();
		obj.add(10,20); //passing values through parameter

	}

}
