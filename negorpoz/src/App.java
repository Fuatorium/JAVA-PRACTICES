import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        double Number = scanner.nextDouble();

        if (Number < 0) {
            System.out.println("Sayi Negatiftir.");
        } else if (Number == 0 ) {
            System.out.println("Sayi 0'a eşittir.");
        } else {
            System.out.println("Sayi 0'dan büyüktür.");
        }
        scanner.close();
    }
}
