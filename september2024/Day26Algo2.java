package september2024;

// Klavyeden girilen yılın artık yıl olup olmadığını bulan program
// Artık yıllar 4'e tam bölünebilen yıllardır. Ancak iki istisna vardır:
// 1- 100'ün katı olan yıllardan sadece 400'e tam bölünebilenler artık yıldır.
// 2- 4000, 16000, 24000 vb. yıllar, 400'e tam bölünebilmesine rağmen artık yıl değildir.
// Bu durumda yıl<4000, olan yıllar için artık yıl hesaplama işlemi şu şekilde yapılabilir
class Day26Algo2 {
    public static void main(String[] args) {
        int yil = 2025;
        if (yil > 4000) {
            System.out.println("4000'den büyük yıllar için hesaplama yapılmamıştır.");
            return;
        }
        if ((yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0) {
            System.out.println(yil + " artık yıldır.");
        } else {
            System.out.println(yil + " artık yıl değildir.");

        }

    }
}
