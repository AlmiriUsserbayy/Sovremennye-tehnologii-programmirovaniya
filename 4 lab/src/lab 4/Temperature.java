import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t < 0)
            System.out.println("Холодно");
        else if (t <= 20)
            System.out.println("Тепло");
        else
            System.out.println("Жарко");
    }
}