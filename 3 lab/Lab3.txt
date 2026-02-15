Задание 1
public class Task1_SumThreeNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        int sum = a + b + c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Сумма = " + sum);
    }
}


Задание 2
public class Task2_Arithmetic {
    public static void main(String[] args) {
        double x = 8;
        double y = 4;

        System.out.println("Сложение: " + (x + y));
        System.out.println("Умножение: " + (x * y));
        System.out.println("Деление: " + (x / y));
    }
}


Задание 3
public class Task3_Assignment {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("До: " + a);

        a = a + 5;

        System.out.println("После: " + a);
    }
}


Задание 4
import java.util.Scanner;

public class Task4_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = scanner.nextInt();

        int square = x * x;

        System.out.println("Квадрат числа: " + square);
    }
}


Задание 5
import java.util.Scanner;

public class Task5_RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину: ");
        double length = scanner.nextDouble();

        System.out.print("Введите ширину: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("Площадь прямоугольника: " + area);
    }
}