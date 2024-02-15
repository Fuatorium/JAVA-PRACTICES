import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Kullanıcı adınızı girin: ");
            String username = scanner.nextLine();
            System.out.print("Şifrenizi girin: ");
            String password = scanner.nextLine();
            
            if (username.equals("admin") && password.equals("12345")) {
                System.out.println("Giriş başarılı!");
                break;
            } else {
                System.out.println("Kullanıcı adı veya şifre hatalı. Tekrar deneyin.");
            }
        } while (true);
        
        scanner.close();
    }
}