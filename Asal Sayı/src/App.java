import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        int Number = scanner.nextInt();

        if (Number % 2 <= 0) {
            System.out.println("Asal Sayidir!");
        } else {
            System.out.println("Asal Sayi degildir!");
        }
    }
}
