import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir karakter giriniz: ");
        char karakter = scanner.next().charAt(0);

        if (Character.isLetter(karakter)) {
            System.out.println("Harftir!");
        } else if (Character.isDigit(karakter)) {
            System.out.println("Sayidir!");
        } else {
            System.out.println("İkiside değil!!");
        }
        scanner.close();
    }
}
