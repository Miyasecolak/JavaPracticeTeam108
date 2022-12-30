package Day03;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        /*
        Verilen bir arrayin elemanlarını ardışık toplamını hesaplayan metodu yazınız
        str={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
         output={3, 5+1, 2+7+9, 2+3+5+7}
       {3,  6,   18,     17}
*/
       int[]arr ={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
       int arr2[]=new int[4];
       int toplam=0,counter=0,indexAra=1;
        for (int i = 0; i <arr2.length ; i++) {


        for (int j = 0; j <=counter ; j++) {
            toplam+=arr[indexAra-1+j];

        }
        arr2[i]=toplam;
        counter++;
        toplam=0;
        indexAra+=counter;
        }
        System.out.println(Arrays.toString(arr2));




    }
}
