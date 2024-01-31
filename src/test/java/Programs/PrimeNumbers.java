package Programs;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            boolean isPrime = true;

            if (i > 1) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            } else {
                isPrime = false;
            }

            if (isPrime) {
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number.");
            }
        }
    }
}
