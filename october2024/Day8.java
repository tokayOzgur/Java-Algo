package october2024;

// number sayısının kaç basamaklı olduğunu bulan program
public class Day8 {
    public static void main(String[] args) {
        int number = 76543210;

        int i = 0;
        while (number > 1) {
            number /= 10;
            i++;
        }
        System.out.println("Basamak sayısı: " + i);
    }
}
