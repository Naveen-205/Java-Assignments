package first.index;

public class Student {
	//variables--stores the data
	String name;
	int age;
	
	//method -- defines behaviour
	void displayInfo() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}

	public static void main(String[] args) {
		//creating the object
		Student s1=new Student();
		
		//assigning the value to the fields
		s1.name = "Krishna";
		s1.age = 22;
		s1.displayInfo();//calling the method
	}

}
