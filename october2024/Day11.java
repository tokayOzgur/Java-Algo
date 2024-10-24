package october2024;

// girilen iki sayı birbirinin katı mı değilmi bulan program
public class Day11 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;

        if (num1 % num2 == 0) {
            System.out.println(num1 + " sayısı " + num2 + " sayısının katıdır.");
        } else if (num2 % num1 == 0) {
            System.out.println(num2 + " sayısı " + num1 + " sayısının katıdır.");
        } else {
            System.out.println("Sayılardan hiçbiri diğerinin katı değildir.");
        }

    }

}
