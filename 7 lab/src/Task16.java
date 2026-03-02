public class Task16 {

    public static int maxX() {
        int[] A = new int[10];
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 50);
            if (A[i] > max)
                max = A[i];
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Максимальный элемент: " + maxX());
    }
}