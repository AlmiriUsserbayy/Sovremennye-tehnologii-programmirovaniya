import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            case '/' -> System.out.println(b != 0 ? a / b : "Деление на ноль");
            default -> System.out.println("Ошибка");
        }
    }
}