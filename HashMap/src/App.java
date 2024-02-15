import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir metin giriniz: ");
        String Metin = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> harfSayilari = new HashMap<>();
        
        for (char harf : Metin.toCharArray()) {
            if (harfSayilari.containsKey(harf)) {
                harfSayilari.put(harf, harfSayilari.get(harf) + 1);
            } 
            else{

                harfSayilari.put(harf, 1);

            }
        }
                System.out.println("Metindeki her harfin tekrar sayilari:");
        for (Map.Entry<Character, Integer> entry : harfSayilari.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}


//Java'da Hashmap kullanılır!!!