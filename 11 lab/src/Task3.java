import java.util.Scanner;

public class Task3 {

    static double add(double a, double b) { return a + b; }
    static double sub(double a, double b) { return a - b; }
    static double mul(double a, double b) { return a * b; }

    static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println(add(a, b));
    }
}