package Test.Day04;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        //Create an array of 5 floats and calculate their sum.


        double[] arr1 = {1.2f, 5.6f, 10.2f, 9.5f, 2.5f};
        double sum = 0;

        System.out.println("***************for loop cözümü*********");

        for (int i = 0; i < arr1.length; i++) {

            sum+=arr1[i];

        }

        System.out.println("sum:" + sum);
        System.out.println("***********While Loop cözümü**********");
        sum=0;
        int index=0;
        while (index<arr1.length){
            sum+=arr1[index];
            index++;
        }
        System.out.println("sum:" + sum);
        System.out.println("+++++++++++++++ While LOOP Cozumu 2 ++++++++++++++++++");

        sum = 0;
        int ind=arr1.length-1;

        while(ind>=0){
            sum+= arr1[ind];
            ind--;
        }
        System.out.println(sum);
    }
}
