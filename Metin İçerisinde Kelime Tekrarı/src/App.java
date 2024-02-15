import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir metin giriniz: ");

        String metin = scanner.nextLine();
        scanner.close();

        Map<String, Integer> kelimeSayilari = new HashMap<>();
        

        String[] kelimeler = metin.split("\\s+");
        
        
        for (String kelime : kelimeler) {
            if (kelimeSayilari.containsKey(kelime)) {
                kelimeSayilari.put(kelime, kelimeSayilari.get(kelime) + 1);
            } else {
                kelimeSayilari.put(kelime, 1);
            }
        }
        
        System.out.println("Metindeki her kelimenin tekrar sayıları:");
        for (Map.Entry<String, Integer> entry : kelimeSayilari.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}
