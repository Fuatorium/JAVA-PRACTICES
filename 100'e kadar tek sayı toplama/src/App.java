public class App {
    public static void main(String[] args) throws Exception {

        int total = 0;
        int i = 1;

        while (i <= 100) {
            if (i % 2 != 0) {
                total += i;
            }
            i++;
        }

        System.out.println("1'den 100'e kadar olan tek sayıların toplamı: " + total);
    }
}
