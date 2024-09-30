package september2024;

// iki pozitif tam sayının bölünmesiye elde edilen; bölüm ve kalanı hesaplayan program (Hazır fonksiyon kullanmadan)
public class Day30 {
    public static void main(String[] args) {
        int a = 31;
        int b = 3;

        int bolum = 0;
        int kalan = a;
        for (int i = 0; i < a && kalan >= b; i++) {
            bolum++;
            kalan -= b;
        }

        System.out.println("Kalan: " + kalan);
        System.out.println("Bölüm: " + bolum);
    }
}
