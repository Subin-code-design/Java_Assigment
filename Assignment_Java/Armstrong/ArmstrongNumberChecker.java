public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        int number = 153;
        boolean isArmstrong = isArmstrongNumber(number);
        if (isArmstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        return sum == originalNumber;
    }
}
