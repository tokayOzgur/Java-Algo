package october2024;

// bir sayının asal olup olmadığını bulan program
public class Day18 {
    public static void main(String[] args) {
        int num = 14;

        String result = "Asaldır";
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = "Asal değildir";
                break;
            }
        }
        System.out.println(result);

    }
}
