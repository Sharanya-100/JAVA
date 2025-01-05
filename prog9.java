import java.util.Scanner;
public class prog9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }

        }
    }
}
