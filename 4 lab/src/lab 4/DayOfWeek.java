import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Неверный номер");
        }
    }
}