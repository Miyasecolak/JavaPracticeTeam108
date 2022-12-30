package Day03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // girilen desimal degeri binary degere ceviren metodu olusturunuz
       // örnek:12=1 1 0 0

        System.out.println("Binary ifadeye cevirilecek desimal degeri giriniz: ");
        Scanner scan =new Scanner(System.in);
        int desimalSayi=scan.nextInt();
        System.out.println(desimalSayi+"sayisinin binary karsiligi: "+binaryCevir(desimalSayi));
    }
    public static ArrayList<Integer>binaryCevir(int desimalSayi){
        
        ArrayList<Integer>binary=new ArrayList<>();
        while(desimalSayi>=1){
            binary.add(desimalSayi%2);
            desimalSayi/=2;
            
        }
      //  Collections.reverse();
        ArrayList<Integer>binaryTers=new ArrayList<>();
        for (int i = binary.size()-1; i>=0; i--) {
            binaryTers.add(binary.get(i));

        }
        return binary;//1,1,0
            
        }
    }

