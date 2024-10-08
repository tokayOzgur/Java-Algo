package october2024;

// n sayısının faktöriyelini hesaplayan program.
public class Day6 {
    public static int calculateFact(int number) {
        if (number < 2)
            return number;
        return number * calculateFact(number - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int fact = calculateFact(n);

        System.out.println(fact);
    }

}
