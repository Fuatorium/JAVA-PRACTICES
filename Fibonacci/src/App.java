public class App {
    public static void main(String[] args) throws Exception {

        int n = 10;
        int a = 0, b = 1;

        System.err.println("Fibonacci Serisi: ");
        System.out.println(a + ", " + b);

        if (n <= 0) {
            System.out.println("Geçersiz giriş.");
        } else if (n == 1) {
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("1");
        } else {
            for (int i = 2; i < n; i++) {
                int temp = a;
                a = b;
                b = temp + b;
                System.out.print(", " + b);
            }
        }
    }
}
