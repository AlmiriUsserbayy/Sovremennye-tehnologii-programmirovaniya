import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String again;

        do {
            System.out.print("a: ");
            double a = sc.nextDouble();

            System.out.print("b: ");
            double b = sc.nextDouble();

            System.out.print("Операция: ");
            char op = sc.next().charAt(0);

            switch (op) {
                case '+': System.out.println(a + b); break;
                case '-': System.out.println(a - b); break;
                case '*': System.out.println(a * b); break;
                case '/':
                    if (b != 0) System.out.println(a / b);
                    else System.out.println("Ошибка");
                    break;
            }

            System.out.print("Еще? (yes/no): ");
            again = sc.next();

        } while (again.equalsIgnoreCase("yes"));
    }
}