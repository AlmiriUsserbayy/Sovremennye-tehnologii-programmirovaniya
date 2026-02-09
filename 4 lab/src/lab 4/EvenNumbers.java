public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Чётные числа от 1 до 20:");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}