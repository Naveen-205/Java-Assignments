package first.index;
import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		String pass = "";
		
		while(pass.length() < 8) {
			System.out.println("Enter Password:");
			pass = user.next();
			
			if(pass.length() < 8) {
				System.out.println("Password too short");
			}
			else {
				System.out.println("Password Accepted");
			}
		}
		user.close();
	}
}
