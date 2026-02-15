import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 0)
            System.out.println("Чётное");
        else
            System.out.println("Нечётное");
    }
}