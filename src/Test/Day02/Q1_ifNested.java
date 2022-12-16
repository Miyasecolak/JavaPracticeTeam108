package Test.Day02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q1_ifNested {
    public static class Q1_digitnumberPositiveNumber {
        public static void main(String[] args) {
            //Kullanicidan bir sayi aliniz
            //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
            //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
            //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

            Scanner blumen = new Scanner(System.in);
            System.out.println("Please enter a number");
            int num1 = blumen.nextInt();

            if (num1 >= 0) {
                if (num1 < 10) {
                    System.out.println("num1 is digit number");
                } else {
                    System.out.println("positive number");
                }


            } else {
                System.out.println("num1 is negative number");
            }
            System.out.println("****************** Ternary Cozumu ********************");


            System.out.println(num1>=0? num1<10? "num1 is digit number":"num1 is positive number":"num1 is negative number");

            System.out.println("====================================");
            String result=(num1>=0) ? ((num1<10)?"num1 is digit number":"num1 positive number") : ("num1 is negative number");
            System.out.println("result:"+ result);








        }
    }
}
