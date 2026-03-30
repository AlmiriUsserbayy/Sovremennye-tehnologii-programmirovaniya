import java.util.*;

public class AdvancedCalculator {

    static ArrayList<String> history = new ArrayList<>();

    static double power(double a, double b) {
        return Math.pow(a, b);
    }

    static double percent(double a, double b) {
        return (a * b) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1:+ 2:- 3:* 4:/ 5:^ 6:sqrt 7:% 8:sin 9:cos 10:tan 0:exit");
            int choice;

            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода!");
                sc.next();
                continue;
            }

            if (choice == 0) break;

            double a, b, res = 0;

            try {
                System.out.print("Введите a: ");
                a = sc.nextDouble();

                if (choice != 6 && choice >=1 && choice <=7) {
                    System.out.print("Введите b: ");
                    b = sc.nextDouble();
                } else {
                    b = 0;
                }

                switch (choice) {
                    case 1: res = a + b; break;
                    case 2: res = a - b; break;
                    case 3: res = a * b; break;
                    case 4:
                        if (b == 0) throw new ArithmeticException();
                        res = a / b; break;
                    case 5: res = power(a, b); break;
                    case 6: res = Math.sqrt(a); break;
                    case 7: res = percent(a, b); break;
                    case 8: res = Math.sin(a); break;
                    case 9: res = Math.cos(a); break;
                    case 10: res = Math.tan(a); break;
                }

                String record = a + " -> " + res;
                history.add(record);

                System.out.println("Результат: " + res);

            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода!");
                sc.next();
            } catch (ArithmeticException e) {
                System.out.println("Деление на 0!");
            }

            // "очистка экрана"
            System.out.println("\n\n\n\n\n");

            // история
            System.out.println("История:");
            for (String h : history) {
                System.out.println(h);
            }
        }
    }
}