// Question 6
public class NumberPattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern
        int number = 1; // Starting number

        // Nested loop to print the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " "); // Print the current number
                number++; // Increment the number for the next position
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
