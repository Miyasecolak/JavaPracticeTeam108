package Test.Day02;

import java.util.Scanner;

public class Q02_SwitchCase {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two number");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

       // System.out.println("Please enter operator Type: \n\n\n\t1 : addition\n\t2 : subtraction\n\t3 : multiplication\n\t4 : division");
        System.out.println("Please enter operator Type: ");

        int operatorType = scan.nextInt();



        if (operatorType==1) System.out.println("Addition ="+ (num1+num2));
        else if (operatorType==2) System.out.println("Subtraction="+(num1-num2));
        else if (operatorType==3) System.out.println("Multiclation ="+(num1*num2));
        else if (operatorType==4) System.out.println("division="+ (num1/num2));
        else System.out.println("invalid str");

        System.out.println("=================");

        switch (operatorType){
            case 1:
                System.out.println("Addition ="+ (num1+num2));
                break;
            case 2:
                System.out.println("Subtraction="+(num1-num2));
                break;
            case 3:
                System.out.println("Multiclation ="+(num1*num2));
            case 4:
                System.out.println("division="+ (num1/num2));
            default:
                System.out.println("invalid str");
        }

        }

    }




