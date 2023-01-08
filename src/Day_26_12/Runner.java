package Day_26_12;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int sayi2=scan.nextInt();
        System.out.println("Yapilacak islemi giriniz(+,-,*,/)");
        char islem=scan.next().charAt(0);
        Islemler islemler=new Islemler();

        switch (islem){
            case '+':{
               System.out.println( "Toplam : "+islemler.toplama(sayi1,sayi2) );
                break;
            }
            case '-':{
                islemler.cikarma(sayi1,sayi2);
                break;
            }
            case '*':{
                islemler.carpma(sayi1,sayi2);
                break;
            }
            case'/':{
                islemler.bolme(sayi1,sayi2);
                break;
            }
        }

    }
}
