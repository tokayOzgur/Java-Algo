package november2024;

/// Klavyeden girilen bir üc basamklı sayının basamaklarının aritmetik ortalamasını bulan program
class Algo1 {
    public static void main(String[] args) {
        int number = 673;
        int b1 = number % 10;
        int b2 = (number / 10) % 10;
        int b3 = number / 100;

        double average = (b1 + b2 + b3) / 3.0;
        System.out.println("Average: " + average);
    }
}