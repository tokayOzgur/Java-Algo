package basic;

// Klavyeden iki kenarı ve derece cinsinden aradaki açısı girilen üçgenin alanı hesaplanacaktır.
public class Algo2 {
    public static void main(String[] args) {
        int kenar1 = 10;
        int kenar2 = 20;
        double aci = 50;
        double alan = (kenar1 * kenar2 * Math.sin(Math.toRadians(aci))) / 2.0;
        System.out.println("Üçgenin alanı: " + alan); // 76.6044
    }
}
