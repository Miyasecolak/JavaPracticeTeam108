package Test.Day02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q02_SwitchCase_Calculator {
    public static void main(String[] args) {
        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabi tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         */


       int num1=10;
       int num2=20;
       char operatorType='*';




       if (operatorType=='+'){
           System.out.println("Addition ="+ (num1+num2));
       } else if (operatorType=='-') {
           System.out.println("Subtraction="+(num1-num2));

       } else if (operatorType=='*') {
           System.out.println("Multiclation ="+(num1*num2));

       }else if (operatorType=='/'){
           System.out.println("division="+ (num1/num2));
       }else {
           System.out.println("wrong Operator");
       }

        System.out.println("=============================");
       switch (operatorType){
           case '+':
               System.out.println("Addition ="+ (num1+num2));
               break;
           case '-':
               System.out.println("Subtraction="+(num1-num2));
               break;

           case '*':
               System.out.println("Multiclation ="+(num1*num2));
               break;
           case '/':
               System.out.println("division="+ (num1/num2));
               break;
           default:
               System.out.println("invalid Input");

       }


    }
}
