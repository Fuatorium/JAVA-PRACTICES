import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        int Number = scanner.nextInt();

        System.out.println("Bir Sayi giriniz: ");
        int Number1 = scanner.nextInt();

        System.out.println("Eşittir: " + Number1 * Number);
    }
}
