package basic;

// Klavyeden bir kenar uzunluğu ve o kenara ait yükseklik bilgisi alınarak üçgenin alanı hesaplanacaktır.
public class Algo1 {
    public static void main(String[] args) {
        int kenar = 5;
        int yukseklik = 10;
        double alan = (kenar * yukseklik) / 2.0;
        System.out.println("Üçgenin alanı: " + alan); // 25.0
    }
}
  