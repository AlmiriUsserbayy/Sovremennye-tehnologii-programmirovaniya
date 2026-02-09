import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 0)
            System.out.println("Положительное");
        else if (n < 0)
            System.out.println("Отрицательное");
        else
            System.out.println("Ноль");
    }
}