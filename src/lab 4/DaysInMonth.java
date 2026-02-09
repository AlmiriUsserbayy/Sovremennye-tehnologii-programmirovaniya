import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 1,3,5,7,8,10,12 -> System.out.println("31 день");
            case 4,6,9,11 -> System.out.println("30 дней");
            case 2 -> System.out.println("28 или 29 дней");
            default -> System.out.println("Неверный месяц");
        }
    }
}