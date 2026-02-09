import java.util.Scanner;

public class RangeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 10 && n <= 50)
            System.out.println("В диапазоне");
        else
            System.out.println("Вне диапазона");
    }
}