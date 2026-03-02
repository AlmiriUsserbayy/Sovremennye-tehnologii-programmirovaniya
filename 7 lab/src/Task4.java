public class Task4 {
    public static void main(String[] args) {
        int[] C = new int[25];
        int mult = 1;

        for (int i = 0; i < C.length; i++) {
            C[i] = (int)(Math.random() * 20 - 10);
            if (C[i] > 0) mult *= C[i];
        }

        System.out.println("Произведение положительных: " + mult);
    }
}