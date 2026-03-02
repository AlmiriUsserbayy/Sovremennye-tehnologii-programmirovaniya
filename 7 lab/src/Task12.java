import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] B = new int[25];

        for (int i = 0; i < B.length; i++)
            B[i] = (int)(Math.random() * 100);

        Arrays.sort(B);

        for (int x : B)
            System.out.print(x + " ");
    }
}