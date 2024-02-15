import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir metin giriniz: ");
        String metin = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> harfASCII = new HashMap<>();
        
        for (char harf : metin.toCharArray()) {
            if (harf != ' ') {
                if (harfASCII.containsKey(harf)) {
                    harfASCII.put(harf, harfASCII.get(harf) + (int) harf); 
                } else {
                    harfASCII.put(harf, (int) harf);
                }
            }
        }
        
        System.out.println("Metindeki her harfin ASCII değerlerinin toplami:");
        for (Map.Entry<Character, Integer> entry : harfASCII.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}
