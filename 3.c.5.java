import java.util.*;

/**
 * 3.c.5
 */
class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int Number = scanner.nextInt();
        int sum = 0;
        while (Number != 0) {
            sum += Number % 10;
            Number /= 10;
        }
        System.out.println(sum);
        scanner.close();
    }
}