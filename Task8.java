package first.index;
import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		String mobile;
		
		do {
			System.out.println("Enter Mobile Number:");
			mobile = num.next();
		}while(mobile.length() == 10);
		
		System.out.println("Mobile Number Accepted");
		num.close();
	}
}
