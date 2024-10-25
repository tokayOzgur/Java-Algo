package october2024;

// klavyeden girilen n adet sayının toplamını ve aritmetik ort. bulan program
public class Day14 {
    public static void main(String[] args) {
        int n[] = { 2, 4, 5, 7, 8 };
        int toplam = 0;
        float aOrt = 0;

        for (int i : n) {
            toplam += i;
        }
        aOrt = toplam / n.length;

        System.out.println("Toplam: " + toplam);
        System.out.println("Aritmetik Ortalama: " + toplam / aOrt);
    }
}
