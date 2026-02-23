import java.util.Scanner;

public class Task4 {

    public static long factorial(int n) {

        if (n < 0) {
            System.out.println("Факториал отрицательного числа не определён.");
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        long result = factorial(number);

        if (result != -1) {
            System.out.println("Факториал числа " + number + " = " + result);
        }

        scanner.close();
    }
}