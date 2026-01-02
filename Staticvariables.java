package first.index;

public class Staticvariables {
	static int x=10;//static is mutable by  default
	static final int y = 20;//static is immutable,while using final keyword

	public static void main(String[] args) {
		//classname.field=value
		Staticvariables.x=90; //static is mutable by  default
		System.out.println("static is mutable by default " + Staticvariables.x);
		
//		Staticvariables.y=80; //static is immutable,while using final keyword
		System.out.println("static is immutable using final keyword " + Staticvariables.y);
	}

}

