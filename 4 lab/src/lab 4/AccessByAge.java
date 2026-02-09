import java.util.Scanner;

public class AccessByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18)
            System.out.println("Доступ разрешён");
        else
            System.out.println("Доступ запрещён");
    }
}