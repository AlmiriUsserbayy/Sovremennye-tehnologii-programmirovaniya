import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score >= 90)
            System.out.println("5");
        else if (score >= 75)
            System.out.println("4");
        else if (score >= 60)
            System.out.println("3");
        else
            System.out.println("2");
    }
}