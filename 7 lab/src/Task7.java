public class Task7 {
    public static void main(String[] args) {
        int[][] B = new int[5][5];
        int[] A = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                B[i][j] = (int)(Math.random() * 20 - 10);
                if (B[i][j] > 0) A[i] += B[i][j];
            }
        }

        for (int i = 0; i < 5; i++)
            System.out.println("Строка " + i + ": " + A[i]);
    }
}