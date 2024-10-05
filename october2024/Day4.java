package october2024;

// klavyeden girilen b tamsayısına göre a^3 - a^2 = b şartını sağlayan  0 < a < 100 tamsayısını bulan prog.
public class Day4 {
    public static void main(String[] args) {
        int b = 18;
        for (int a = 1; a < 100; a++) {
            if (Math.pow(a, 3) - Math.pow(a, 2) == b)
                System.out.println("Şart sağlandı, a: " + a);
        }
    }
}
