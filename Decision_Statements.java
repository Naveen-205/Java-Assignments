package first.index;
import java.util.Scanner;

public class Decision_Statements {
	public static void main (String[] args) {
		System.out.println("Enter the Mark:");
		Scanner obj = new Scanner(System.in);
		int mark = obj.nextInt();
//		
//		if (age>=18) {
//			System.out.println("Eligible for Vote");
//		}
//		else {
//			System.out.println("Not Eligible for Vote");
//		}
		
		if (mark>=90) {
			System.out.println("Grade A");
		}
		else if (mark>=80) {
			System.out.println("Grade B");
		}
		else if (mark>=60) {
			System.out.println("Grade C");
		}
		else if (mark>=40) {
			System.out.println("Grade D");
		}
		else if (mark>=35) {
			System.out.println("Grade E");
		}
		else {
			System.out.println("Failed");
		}
		
		obj.close();
	}
}
