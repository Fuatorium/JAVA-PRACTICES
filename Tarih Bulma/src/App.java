import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Günü girin: ");
        int gun = scanner.nextInt();
        System.out.print("Ayi girin: ");
        int ay = scanner.nextInt();
        System.out.print("Yili girin: ");
        int yil = scanner.nextInt();
        scanner.close();


        Calendar takvim = new GregorianCalendar(yil, ay - 1, gun);


        String[] gunler = {"Pazar", "Pazartesi", "Sali", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};
        int gun_index = takvim.get(Calendar.DAY_OF_WEEK) - 1;
        String gun_adi = gunler[gun_index];


        System.out.println(gun + "." + ay + "." + yil + " tarihi " + gun_adi + " günüdür.");
    }
}

// Java dokümanına göre: GregorianCalendar, Takvim'in somut bir alt sınıfıdır ve dünyanın çoğu tarafından kullanılan standart takvim sistemini sağlar.