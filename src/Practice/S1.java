package Practice;

public class S1 {

        /*

       sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.
       DEĞİLSE While kullanılır, Eğer döngüye bir kez mutlaka girilecekse DO_WHILE kullanılır.

       Problem Tanımı
        100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).

         Ekran Çıktısı
        91
        78
        65
        52
        39
        26
        13       */
        public static void main(String[] args) {

        int toplam = 0;
        for (int i = 100; i > 0; i--) {
            toplam = 0;

            if (i % 13 == 0) {
                System.out.println("13 'e bölünebilen sayilar:" + i);
                toplam++;
            }
            toplam+=toplam;
        }

        System.out.println("toplam:" + toplam);
    }
}
