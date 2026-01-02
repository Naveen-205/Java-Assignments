package first.index;

public class LocalVariable_Task {
	void local() {
		int a = 20; //local variables
		int b = 30;
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		LocalVariable_Task obj = new LocalVariable_Task();
		obj.local();
	}

}
