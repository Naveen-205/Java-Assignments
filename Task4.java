package first.index;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		System.out.println("Enter Age:");
		Scanner user = new Scanner(System.in);
		int age = user.nextInt();
		
		if (age<13) {
			System.out.println("Child");
		}
		else if(age<20) {
			System.out.println("Teenager");
		}
		else if(age<60) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior Citizen");
		}
		user.close();
	}
}
