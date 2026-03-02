public class Task1 {
    public static void main(String[] args) {
        int[] A = new int[20];
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 40 - 20);
            if (A[i] < 0) sum += A[i];
        }

        System.out.println("Сумма отрицательных элементов: " + sum);
    }
}