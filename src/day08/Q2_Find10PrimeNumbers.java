package day08;

import java.util.ArrayList;
import java.util.List;

public class Q2_Find10PrimeNumbers {
    //     /*
//         * Write a program that accepts an integer as
//         input and prints first 10 prime
//         * numbers greater than input
//         *
//         * Check numbers if they are even or
//         not in a return method
//         */
    public static void main(String[] args) {
        int input = 5;
        int count = 0;

        List<Integer> first10PrimeNumber = new ArrayList<>();

        while (count < 10) {
            input++;

            if (isPrime(input)) {
                first10PrimeNumber.add(input);
                count++;

            }
        }
        System.out.println(first10PrimeNumber);

    }

    private static boolean isPrime(int num) {


        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                return false;

            }

        }
        return true;
    }

}
