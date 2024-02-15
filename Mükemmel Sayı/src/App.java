import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayi girin: ");
        int sayi = scanner.nextInt();
        
        if (mukemmelSayi(sayi)) {
            System.out.println(sayi + " mükemmel bir sayidir.");
        } else {
            System.out.println(sayi + " mükemmel bir sayi değildir.");
        }
        
        scanner.close();
    }

    public static boolean mukemmelSayi(int sayi) {
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        return toplam == sayi;
    }
}
