public class Task10 {
    public static void main(String[] args) {
        int[][] D = new int[7][7];
        int sum = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                D[i][j] = (int)(Math.random() * 20);
                if (i == j)
                    sum += D[i][j];
            }
        }

        double avg = (double) sum / 7;
        System.out.println("Среднее диагонали: " + avg);
    }
}