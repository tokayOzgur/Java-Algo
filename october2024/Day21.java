package october2024;

// 100-999 arasında olan basamaklarının toplamı basamak sayısına eşit olan tamsayıları bulan program
public class Day21 {
    public static void main(String[] args) {

        for (int i = 100; i < 999; i++) {
            if (calculate(i))
                System.out.println(i);
        }

    }

    static boolean calculate(int num) {
        int number = num;
        int i = number % 10;
        number /= 10;
        int j = number % 10;
        number /= 10;
        int k = number % 10;

        if ((i + j + k) == 3)
            return true;
        return false;

    }
}
