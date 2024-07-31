// Question 3
public class FirstTenPrimes {
    public static void main(String[] args) {
        int count = 0; // To count the number of prime numbers found
        int number = 2; // Starting from the first natural number

        System.out.println("The first 10 prime numbers are:");

        while (count < 10) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a divisor, not a prime
            }
        }
        return true; // No divisors found, it's a prime
    }
}
