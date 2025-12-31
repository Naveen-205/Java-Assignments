package first.index;
import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		char user;
		
		do {
			System.out.println("\n--Program Started--");
			System.out.println("Do you want to continue (y/n):");
			user = obj.next().charAt(0);
			
		}while(user == 'y' || user == 'Y');
		System.out.println("Program Stopped");
		obj.close();
	}
	
}
