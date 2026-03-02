public class Task15 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((int)(Math.random() * 10) + " ");
            }
            System.out.println();
        }
    }
}