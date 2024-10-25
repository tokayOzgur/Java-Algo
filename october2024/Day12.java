package october2024;

// 1-100 arasındaki sayıların toplamını bulan program
public class Day12 {
    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 1; i <= 100; i++) {
            toplam += i;
        }
        System.out.println("1-100 arasındaki sayıların toplamı: " + toplam);
    }
}
