package september2024;

// a^b (a üssü b) yi hesaplayan (hazır fonksiyon kullanmadan) program
public class Day29 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }

        System.out.println(result);
    }
}
