import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sayi1, sayi2;
        String operator;

        System.out.println("İki sayı girin:");
        sayi1 = scanner.nextDouble();
        sayi2 = scanner.nextDouble();

        System.out.println("Hangi işlemi yapmak istiyorsunuz? (+, -, *, /, %, ^, sin, cos, tan, log, ln, pi)");
        operator = scanner.next();

        switch (operator) {
            case "+":
            case "-":
            case "*":
            case "/":
            case "%":
            case "^":
                hesapla(operator.charAt(0), sayi1, sayi2);
                break;
            case "sin":
                System.out.println("Sinüs: " + Math.sin(Math.toRadians(sayi1)));
                break;
            case "cos":
                System.out.println("Kosinüs: " + Math.cos(Math.toRadians(sayi1)));
                break;
            case "tan":
                System.out.println("Tanjant: " + Math.tan(Math.toRadians(sayi1)));
                break;
            case "log":
                System.out.println("Logaritma: " + Math.log10(sayi1));
                break;
            case "ln":
                System.out.println("Doğal Logaritma: " + Math.log(sayi1));
                break;
            case "pi":
                System.out.println("Pi (π): " + Math.PI);
                break;
            default:
                System.out.println("Geçersiz operatör!");
        }

        scanner.close();
    }

    public static void hesapla(char operator, double sayi1, double sayi2) {
        switch (operator) {
            case '+':
                System.out.println("Toplam: " + (sayi1 + sayi2));
                break;
            case '-':
                System.out.println("Fark: " + (sayi1 - sayi2));
                break;
            case '*':
                System.out.println("Çarpım: " + (sayi1 * sayi2));
                break;
            case '/':
                if (sayi2 != 0) {
                    System.out.println("Bölüm: " + (sayi1 / sayi2));
                } else {
                    System.out.println("Bir sayı sıfıra bölünemez!");
                }
                break;
            case '%':
                System.out.println("Mod: " + (sayi1 % sayi2));
                break;
            case '^':
                System.out.println("Üs: " + Math.pow(sayi1, sayi2));
                break;
            default:
                System.out.println("Geçersiz operatör!");
        }
    }
}
