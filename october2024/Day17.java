package october2024;

// girilen sayının 0 mı, negatif mi veya pozitif mi olduğunu bulan program
public class Day17 {
    public static void main(String[] args) {
        int num = -10;

        if (num > 0) {
            System.out.println("Pozitif Sayı");
        } else if (num < 0) {
            System.out.println("Negatif Sayı");
        } else
            System.out.println("Sıfır");
    }
}
