import java.util.Scanner;

public class Task1 {

    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ширину: ");
        double width = scanner.nextDouble();

        System.out.print("Введите высоту: ");
        double height = scanner.nextDouble();

        double area = rectangleArea(width, height);

        System.out.println("Площадь прямоугольника: " + area);

        scanner.close();
    }
}