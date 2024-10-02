package october2024;

// bir pozitif sayının tamsayı olup olmadığını hesaplayan program
public class Day2 {
    public static void main(String[] args) {
        double number = 5.5;
        if (number == (int) number) {
            System.out.println("Girilen değer bir tam sayıdır");
        } else {
            System.out.println("Girilen değer bir tam sayı değildir.");
        }
    }
}
