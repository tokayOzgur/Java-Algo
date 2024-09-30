package september2024;

// Klavyeden girilen iki tam sayıyı çarpma operatörü kullanmadan çarpan program
public class Day28 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int result = 0;
        for (int i = 0; i < a; i++) {
            result += b;
        }
        System.out.println(result);
    }
}
