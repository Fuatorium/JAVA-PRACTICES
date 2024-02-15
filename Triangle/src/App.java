import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Kenari giriniz: ");
        double kenar1 = scanner.nextDouble();

        System.out.println("2. Kenari giriniz: ");
        double kenar2 = scanner.nextDouble();

        System.out.println("3. Kenari giriniz: ");
        double kenar3 = scanner.nextDouble();

        if (kenar1 + kenar2 > kenar3 && kenar1 + kenar3 > kenar2 && kenar2 + kenar3 > kenar1) {
            System.out.println("Evet bu bir üçgendir!");
        } else {
            System.out.println("Bu üçgen değildir!");
        }
    }
}
