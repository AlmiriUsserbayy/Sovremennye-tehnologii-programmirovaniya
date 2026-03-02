public class Task3 {
    public static void main(String[] args) {
        double[] A = new double[12];
        double mult = 1;

        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random() * 20 - 10;
            if (A[i] < 0) mult *= A[i];
        }

        System.out.println("Произведение отрицательных: " + mult);
    }
}