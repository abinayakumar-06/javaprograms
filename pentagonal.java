public class pentagonal {
    public static void main(String[] args) {
        for (int n = 1; n <= 50; n++) {
            long a = (n * (3L * n - 1) / 2);
            System.out.println("P" + n + " = " + a);
        }
    }
}