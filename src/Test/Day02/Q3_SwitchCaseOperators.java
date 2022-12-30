package Test.Day02;

import java.util.Scanner;

public class Q3_SwitchCaseOperators {
    public static void main(String[] args) {
        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabi tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : strs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two number");

        int a= scan.nextInt();
        int b = scan.nextInt();

        // System.out.println("Please enter operator Type: \n\n\n\t1 : addition\n\t2 : subtraction\n\t3 : multiplication\n\t4 : division");
        System.out.println("Please enter operator Type: ");

        int operatorType = scan.nextInt();

        switch (operatorType) {
            case 1:
                System.out.println(a + " + " + b + " = " + (a + b));
                break;

            case 2:
                System.out.println(a + " - " + b + " = " + (a - b));
                break;

            case 3:
                System.out.println(a + " * " + b + " = " + (a * b));
                break;

            case 4:
                if (b == 0) System.out.println("0'a bolum tanimsizdir");
                else System.out.println(a + " / " + b + " = " + (a / b));
                break;

            default:
                System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz");
        }




        System.out.println("Islem turunu seciniz : \n\t+ : Toplama\n\t- : Cikarma\n\t* : Carpma\n\t/ : Bolme");



        char character = scan.next().charAt(0);

        switch (character){
            case '+' : System.out.println(a + " + " + b +" = " + (a+b)); break;

            case '-' : System.out.println(a + " - " + b +" = " + (a-b)); break;

            case '*' : System.out.println(a + " * " + b +" = " + (a*b)); break;

            case '/' : if(b==0) System.out.println("0'a bolum tanimsizdir");
            else System.out.println(a + " / " + b +" = " + (a/b)); break;

            default: System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz");
        }

    }
}
