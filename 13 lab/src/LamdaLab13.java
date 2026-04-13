import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class LambdaLab13 {

    public static void main(String[] args) {

        // Исходные данные
        List<Integer> numbers = Arrays.asList(5, 12, 7, 3, 12, 20, 9, 5);
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "strawberry", "pear", "grape");

        // Задание 1: Сложение двух чисел
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("1. Сумма: " + add.apply(5, 10));

        // Задание 2: Строка в верхний регистр
        Function<String, String> toUpper = s -> s.toUpperCase();
        System.out.println("2. Верхний регистр: " + toUpper.apply("java"));

        // Задание 3: Фильтрация нечётных чисел
        System.out.print("3. Нечётные числа: ");
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Задание 4: Квадрат каждого числа
        System.out.print("4. Квадраты чисел: ");
        numbers.stream()
                .map(n -> n * n)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Задание 5: Максимальный элемент
        int max = numbers.stream()
                .max(Integer::compare)
                .orElse(0);
        System.out.println("5. Максимальный элемент: " + max);

        // Задание 6: Сортировка строк по длине
        System.out.println("6. Сортировка по длине:");
        strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);

        // Задание 7: Первая буква заглавная
        System.out.println("7. Первая буква заглавная:");
        strings.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .forEach(System.out::println);

        // Задание 8: Строки длиной более 5 символов
        System.out.println("8. Строки длиной > 5:");
        strings.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);

        // Задание 9: Method Reference
        System.out.println("9. Вывод чисел:");
        numbers.forEach(System.out::println);

        // Задание 10: Optional – минимальное число
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println("10. Минимальный элемент: " + min.orElse(0));

        // Задание 11: Consumer
        Consumer<String> printer = s -> System.out.println("11. " + s);
        printer.accept("Hello, Java!");

        // Задание 12: Supplier
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);
        System.out.println("12. Случайное число: " + randomSupplier.get());

        // Задание 13: Сортировка объектов по возрасту
        List<Student> students = getStudents();
        System.out.println("13. Сортировка по возрасту:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getAge))
                .forEach(System.out::println);

        // Задание 14: Работа с объектами Student
        System.out.println("14. Студенты с оценкой > 80:");
        students.stream()
                .filter(s -> s.getGrade() > 80)
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);

        // Задание 15: Цепочка Stream
        System.out.println("15. Stream chaining:");
        numbers.stream()
                .filter(n -> n > 5)
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);

        // Задание 16: Группировка по возрасту
        System.out.println("16. Группировка по возрасту:");
        Map<Integer, List<Student>> grouped =
                students.stream()
                        .collect(Collectors.groupingBy(Student::getAge));
        grouped.forEach((age, list) ->
                System.out.println(age + ": " + list));

        // Задание 17: Сумма элементов списка
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("17. Сумма элементов: " + sum);

        // Задание 18: distinct + limit
        System.out.println("18. Уникальные первые 3 элемента:");
        numbers.stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        // Задание 19: flatMap
        System.out.println("19. flatMap:");
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        listOfLists.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);

        // Задание 20: Обработка заказов
        System.out.println("20. Заказы свыше 1000:");
        List<Integer> orders = Arrays.asList(500, 1500, 700, 2000, 1200);

        orders.stream()
                .filter(o -> o > 1000)
                .sorted()
                .forEach(System.out::println);
    }

    // Метод для создания списка студентов
    private static List<Student> getStudents() {
        return Arrays.asList(
                new Student("Aruzhan", 20, 85),
                new Student("Dias", 22, 75),
                new Student("Alina", 19, 90),
                new Student("Nursultan", 21, 88),
                new Student("Dana", 20, 95)
        );
    }
}

// Класс Student
class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + " (возраст: " + age + ", оценка: " + grade + ")";
    }
}