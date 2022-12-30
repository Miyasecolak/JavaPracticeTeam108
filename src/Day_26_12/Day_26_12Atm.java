package Day_26_12;

import java.util.Scanner;

public class Day_26_12Atm {
    public static void main(String[] args) {
        System.out.println("Atm ye hosgeldiniz");

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 16 haneli kart numaranizi giriniz");
        String kartNo = input.nextLine();
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = input.nextLine();
        boolean kartNokontrol = true;
        boolean sifrekontrol = true;


        if (kartNokontrol) {
            if (sifrekontrol) {

            }
        } else {
            System.out.println("Lutfen kart numaranizi ve sifrenizi tekrar giriniz");
        }
        System.out.println(" Islem Menusu:");
        System.out.println("1.Bakiye sorgula");
        System.out.println("2.para yatirma");
        System.out.println("3.para çekme");
        System.out.println("4.para gonderme");
        System.out.println("5.sifre değiştirme ");
        System.out.println("6.cikis islemleri");

        int secenekler = input.nextInt();


        switch (secenekler) {
            case 2:
            case 3:
//                Para çekme ve para gonderme işleminde
//                mevcut bakiyeden buyuk para çekilemez
                break;
            case 4:
//                Para gönderme işleminde istenen iban TR
//                ile baslamali ve toplam 26 karakterli olmali,
//                eger değilse menü ekraninageri donsun
                break;
            case 5:
//                şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali
                break;
            default:
                System.out.println("gecersiz giris Lutfen tekrar deneyin");
        }
    }
}
