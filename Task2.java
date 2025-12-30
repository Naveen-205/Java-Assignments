package first.index;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		Scanner user = new Scanner(System.in);
		int num = user.nextInt();
		
		if(num%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		user.close();
	}
}
