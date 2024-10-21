package october2024;

// girilen sayı 15 in katı mı değilmi bulan program
public class Day10 {
    public static void main(String[] args) {
        int num = 45;

        if (num > 15 && num % 15 == 0) {
            System.out.println("Sayı 15in katıdır.");
        } else {
            System.out.println("Sayı 15in katıdı değildir.");
        }
    }
}
