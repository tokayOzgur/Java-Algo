package september2024;

// n sayısına kadar olan sayıların tamsayıların, tek sayıların ve çift sayıların toplamlarını ekrana yazdıran program
public class Day1Algo3 {
    public static void main(String[] args) {
        int n = 50;
        int toplam = 0;
        int tekToplam = 0;
        int ciftToplam = 0;

        for (int i = 1; i <= 50; i++) {
            toplam += i;
            if (i % 2 == 0) {
                ciftToplam += i;
            } else {
                tekToplam += i;
            }
        }
        System.out.println("1'den " + n + "'e kadar olan sayıların toplamı: " + toplam);
        System.out.println("1'den " + n + "'e kadar olan tek sayıların toplamı: " + tekToplam);
        System.out.println("1'den " + n + "'e kadar olan çift sayıların toplamı: " + ciftToplam);
    }
}
