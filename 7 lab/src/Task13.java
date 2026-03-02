public class Task13 {
    public static void main(String[] args) {
        int[] C = new int[20];
        int sum = 0;

        for (int i = 0; i < C.length; i++) {
            C[i] = (int)(Math.random() * 50);
            sum += C[i];
        }

        System.out.println("Среднее: " + (double)sum / C.length);
    }
}