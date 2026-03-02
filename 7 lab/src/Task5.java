public class Task5 {
    public static void main(String[] args) {
        int[] D = new int[17];
        int sum = 0;

        for (int i = 0; i < D.length; i++) {
            D[i] = (int)(Math.random() * 20);
            sum += D[i];
        }

        double avg = (double) sum / D.length;
        System.out.println("Среднее арифметическое: " + avg);
    }
}