import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tarih giriniz: ");

        int Year = scanner.nextInt();

        if (Year% 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
            System.out.println("Artik Yildir!!!");
        } else {
            System.out.println("Artik yil değildir.");
        }

        scanner.close();
    }
}