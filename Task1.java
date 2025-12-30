package first.index;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("Enter the Mark:");
		Scanner result = new Scanner(System.in);
		int mark = result.nextInt();
		
		if (mark>=40) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		result.close();
	}
}
