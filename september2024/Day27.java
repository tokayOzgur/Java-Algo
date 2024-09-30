package september2024;

//Klayveden girilen saat(0-11) ve dakika(0-59) değerlerine göre akrep ile yelkovan arasındaki açıyı hesaplayan program
public class Day27 {
    public static void main(String[] args) {
        int hour = 5;
        int minute = 40;
        double angle = Math.abs((hour * 30 + minute * 0.5) - (minute * 6));
        System.out.println(angle);
    }
}
