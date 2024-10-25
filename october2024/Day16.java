package october2024;

// girilen iki sayı arasındaki sayılardan 7 nin katı olanları bulan program
public class Day16 {
    public static void main(String[] args) {
        int smallNum = 3;
        int bigNum = 44;

        for (int i = smallNum; i < bigNum; i++) {
            if (i % 7 == 0)
                System.out.println(i + " sayısı 7 nin katıdır");
        }
    }
}
