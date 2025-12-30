package first.index;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Password:");
		String pass = obj.next();
		
			if(pass.length()<8) {
				System.out.println("Weak Password");
			}
			else {
				System.out.println("Strong Password");
			}
			obj.close();
	}
}
