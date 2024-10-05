package october2024;

// 7 den büyük tamsayılar (S>7), 3 ve 5 in katlarının toplamı (3.a + 5.b = S) olarak yazılabilir.
// Girilen tam sayı için 3 (a) ve 5'in (b) katlarını bulan program.
public class Day5 {
    public static void main(String[] args) {
        int s = 18;
        for (int a = 1; a <= s; a++) {
            for (int b = 1; b <= s; b++) {
                if (3 * a + 5 * b == s) {
                    System.err.println("a: " + a);
                    System.err.println("b: " + b);
                }
            }
        }

    }
}
