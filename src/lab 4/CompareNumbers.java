import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b)
            System.out.println("Первое больше");
        else if (a < b)
            System.out.println("Второе больше");
        else
            System.out.println("Числа равны");
    }
}