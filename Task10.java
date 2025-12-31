package first.index;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number;
		
		do {
			System.out.println("Enter Mobile Number:");
			number = sc.next();
		}while(number.length() != 10);
		System.out.println("Mobile Accepted");
		
		sc.close();
	}

}
