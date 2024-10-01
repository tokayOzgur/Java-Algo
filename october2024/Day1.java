package october2024;

// a ve b değişkenlerinin değerlerinin karşılıklı yer değiştirmesini yapan program
public class Day1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("İlk hali: a=" + a + ", b=" + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("Yeni hali: a=" + a + ", b=" + b);
    }

}
