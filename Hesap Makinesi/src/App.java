import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sayi1, sayi2, sonuc;
        char operator;

        System.out.println("İki sayi girin:");
        sayi1 = scanner.nextDouble();
        sayi2 = scanner.nextDouble();

        System.out.println("Hangi işlemi yapmak istiyorsunuz? (+, -, *, /)");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                sonuc = sayi1 + sayi2;
                System.out.println("Toplam: " + sonuc);
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                System.out.println("Fark: " + sonuc);
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                System.out.println("Çarpım: " + sonuc);
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Bölüm: " + sonuc);
                } else {
                    System.out.println("Bir sayi sifira bölünemez!");
                }
                break;
            default:
                System.out.println("Geçersiz operatör!");
        }

        scanner.close();
    }
}
