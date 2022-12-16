package Test.Day03;

import java.util.Scanner;

public class Day03 {
    public static void main(String[] args) {
        /*
   Kullanicidan uc adet sayi alarak bu sayilarin
   bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
   NOT:
   Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
   denkleminden yararlanabilirsiniz.
   -----Ornek Ekran Ciktisi-----
   ilk kenari giriniz: 2
   ikinci kenari giriniz 15
   üçüncü kenari giriniz: 7
   Bu bir dik ucgen degildir.
   Bu bir dik ucgendir.
*/

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen ücgenin birinci kenar uzunlugunu giriniz"  );
        int a= scan.nextInt();
        System.out.println("Lütfen ücgenin ikinci kenar uzunlugunu giriniz" );
        int b=scan.nextInt();
        System.out.println("Lütfen ücgenin hipotenis uzunlugunu giriniz" );
        int hipotenisC=scan.nextInt();
        if ( (a*a)+(b*b) ==(hipotenisC*hipotenisC)){
            System.out.println( "Bu bir dik ucgendir");

        }else {
            System.out.println("Bu bir dik ucgen degildir.");
        }
    }
}
