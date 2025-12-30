package first.index;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		int correctPin = 1234;
		int pin = 0;
		
		while(pin != correctPin) {
			System.out.println("Enter Your PIN:");
			pin = user.nextInt();
		}
		System.out.println("PIN Accepted");
		user.close();
	}
}
