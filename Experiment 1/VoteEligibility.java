// Question 1
import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the candidate's age: ");
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("The candidate is eligible to cast their own vote.");
        } else {
            System.out.println("The candidate is not eligible to cast their own vote.");
        }
        
        scanner.close();
    }
}
