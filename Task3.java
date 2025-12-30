package first.index;
import java.util.Scanner;

public class Task3 {
		public static void main(String[] args) {
			
			Scanner form = new Scanner(System.in);
			
			String username = "naveen";
			String password = "12345";
			
			System.out.println("Enter Username:");
			String user = form.next();
			
			System.out.println("Enter Password:");
			String pass = form.next();
			
			if (user.equals(username) && pass.equals(password)) {
				System.out.println("Login Successfull");
			}
			else {
				System.out.println("Invalid Credentials");
			}
			form.close();
		}
}
