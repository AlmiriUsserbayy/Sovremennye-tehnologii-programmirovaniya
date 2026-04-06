import java.util.*;

public class StringLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // 1. Длина строки
        System.out.println("Длина строки: " + input.length());

        // 2. Изменение регистра
        System.out.println("Верхний регистр: " + input.toUpperCase());
        System.out.println("Нижний регистр: " + input.toLowerCase());

        // 3. Подсчёт слов
        String[] words = input.trim().split("\\s+");
        System.out.println("Количество слов: " + words.length);

        // 4. Обратный порядок слов
        System.out.print("Слова наоборот: ");
        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.print(reversed + " ");
        }
        System.out.println();

        // 5. Поиск слова
        System.out.print("Введите слово для поиска: ");
        String search = scanner.nextLine();
        System.out.println("Содержится: " + input.contains(search));

        // 6. Замена слова
        System.out.print("Что заменить: ");
        String oldWord = scanner.nextLine();
        System.out.print("На что заменить: ");
        String newWord = scanner.nextLine();
        System.out.println("Результат: " + input.replace(oldWord, newWord));

        // 7. Проверка палиндрома
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        System.out.println("Палиндром: " + cleaned.equals(reversed));

        // 8. Сравнение строк
        System.out.print("Введите строку для сравнения: ");
        String second = scanner.nextLine();
        System.out.println("Равны: " + input.equals(second));

        // 9. Разделение строки
        String[] parts = input.split(",");
        System.out.println("Разделение по запятой: " + Arrays.toString(parts));

        // 10. Гласные и согласные
        int vowels = 0, consonants = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiouаеёиоуыэюя".indexOf(c) != -1)
                vowels++;
            else if (Character.isLetter(c))
                consonants++;
        }
        System.out.println("Гласные: " + vowels + ", Согласные: " + consonants);

        // 11. Удаление пробелов
        System.out.println("Без пробелов: " + input.replace(" ", ""));

        // 12. Самое длинное слово
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        System.out.println("Самое длинное слово: " + longest);

        // 13. Символы без пробелов
        System.out.println("Символов без пробелов: " + input.replace(" ", "").length());

        // 14. Начинается ли строка
        System.out.print("Проверка начала: ");
        String start = scanner.nextLine();
        System.out.println(input.startsWith(start));

        // 15. Заканчивается ли строка
        System.out.print("Проверка конца: ");
        String end = scanner.nextLine();
        System.out.println(input.endsWith(end));

        // 16. Полный разворот строки
        System.out.println("Строка наоборот: " + new StringBuilder(input).reverse());

        // 17. Удаление цифр
        System.out.println("Без цифр: " + input.replaceAll("\\d", ""));

        // 18. Замена гласных
        System.out.println("Гласные заменены: " + input.replaceAll("[aeiouаеёиоуыэюяAEIOUАЕЁИОУЫЭЮЯ]", "*"));

        // 19. Частота символов
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println("Частота символов: " + map);

        // 20. Только цифры?
        System.out.println("Только цифры: " + input.matches("\\d+"));

        scanner.close();
    }
}