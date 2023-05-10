import java.util.Scanner;

public class SumOfEvenOrOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Enter 'even' or 'odd': ");
        String choice = scanner.next();

        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (choice.equals("even") && i % 2 == 0) {
                sum += i;
            } else if (choice.equals("odd") && i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum of " + choice + " numbers below " + number + ": " + sum);
    }
}
