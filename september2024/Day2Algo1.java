package september2024;

/// katsayıları verilen 1. dereceden bir denklemin kökünü bulan program
public class Day2Algo1 {
    public static void main(String[] args) {
        // denklem = ax + b = c
        int a = 2;
        int b = 5;
        int c = 11;
        int x = (c - b) / a;
        System.out.println("Denklemin kökü: " + x);

    }

}