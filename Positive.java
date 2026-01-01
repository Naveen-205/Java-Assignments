package first.index;
import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number = sc.nextInt();
		
		String result = (number>0)?"Positive Number":(number<0)?"Negative Number":"Zero";
			System.out.println(result);
		sc.close();
	}
}
