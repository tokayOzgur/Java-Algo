package october2024;

// iki sayı arasındaki farkın yüzdeliğini hesaplayan program
public class Day3 {
    public static void main(String[] args) {
        int number1 = 6602;
        int number2 = 6592;
        double percentage = (double) Math.abs(number1 - number2) / Math.max(number1, number2) * 100;
        System.out.println("İki sayı arasındaki farkın yüzdesi: " + percentage);

        number1 -= number1 * percentage / 100;
        System.out.println("İlk sayıya yüzde " + percentage + " çıkarmış hali: " + number1);
    }
}
