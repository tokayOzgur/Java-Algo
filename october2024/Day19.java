package october2024;

// girilen sayının mükemmel olup olmadığını bulan program
public class Day19 {
    public static void main(String[] args) {
        int num = 6;
        int total = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        if (total == num) {
            System.out.println("Mükemmel Sayıdır");
        } else
            System.out.println("Mükemmel Sayı Değildir");
    }
}
