public class Task11 {
    public static void main(String[] args) {
        int[] A = new int[25];

        for (int i = 0; i < A.length; i++)
            A[i] = (int)(Math.random() * 100);

        int min = 0, max = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[min]) min = i;
            if (A[i] > A[max]) max = i;
        }

        int temp = A[min];
        A[min] = A[max];
        A[max] = temp;

        System.out.println("Обмен выполнен.");
    }
}