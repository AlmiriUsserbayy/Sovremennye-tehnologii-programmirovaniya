public class Task8 {
    public static void main(String[] args) {
        int[][] A = new int[12][6];
        int[] result = new int[6];

        for (int j = 0; j < 6; j++)
            result[j] = 1;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = (int)(Math.random() * 20 - 10);
                if (A[i][j] < 0)
                    result[j] *= A[i][j];
            }
        }

        for (int j = 0; j < 6; j++)
            System.out.println("Столбец " + j + ": " + result[j]);
    }
}