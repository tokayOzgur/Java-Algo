package october2024;

// girilen iki sayı arasındaki her bir sayının  karesini bulan program
public class Day13 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        int minNum = 0;
        if (num1 < num2)
            minNum = num1;
        else
            minNum = num2;

        for (int i = minNum; i <= num1 + num2 - minNum; i++) {
            System.out.println(i + " sayısının karesi: " + i * i);
        }

    }

}
