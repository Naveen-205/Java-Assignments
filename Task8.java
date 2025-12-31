package first.index;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int choice;

        do {
        	
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Exit");
            System.out.println("Enter Your Choice:");         

            choice = obj.nextInt();

            if (choice == 1) {
                    System.out.print("Enter first number: ");
                    int a = obj.nextInt();
                    System.out.print("Enter second number: ");
                    int b = obj.nextInt();
                    System.out.println("Result = " + (a + b));
            }
            else if (choice == 2) {
                    System.out.print("Enter first number: ");
                    int x = obj.nextInt();
                    System.out.print("Enter second number: ");
                    int y = obj.nextInt();
                    System.out.println("Result = " + (x - y));
            }
            else if (choice == 3) {
                    System.out.println("Exiting program...");
            }
            else {
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);   

        obj.close();
    }
}