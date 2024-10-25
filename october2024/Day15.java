package october2024;

// Girilen iki sayı arasındaki, her sayının faktoriyelini hesaplayan program
public class Day15 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 6;

        int minNum, maxNum;
        if (num1 > num2) {
            minNum = num2;
            maxNum = num1;
        } else {
            minNum = num1;
            maxNum = num2;
        }

        for (int i = minNum; i < maxNum; i++) {
            System.out.println(i + "sayısının faktoriyeli: " + getFact(i));
        }

    }

    static int getFact(int num) {
        if (num == 0)
            return 1;
        return num * getFact(num - 1);
    }
}
