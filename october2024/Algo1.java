package october2024;

//Bir pozitif tamsayıyı tersten yazdıran program
public class Algo1 {
    public static void main(String[] args) {
        int number = 123456;
        String reverString = "";

        System.out.println(number);
        while (number > 0) {
            reverString += number % 10;
            number /= 10;
        }
        System.out.println(reverString);

    }
}
