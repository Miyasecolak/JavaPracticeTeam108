package Test.Day045;

public class Q_4 {
    public static void main(String[] args) {
//  4-String' lerden oluşan bir arrayde öğeler 'n'
//  veya 'k' ile bitiyorsa, o öğelerin baş harflerini ekrana yazdıran metodu yazınız.
        //Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JMJ

        String []strArr={ "Kemal", "Jonathan", "Mark", "Jackson", "Ali" };
        System.out.println(harfKontrol(strArr));


        }


    private static String harfKontrol(String[] strArr) {
        String ilkHarfler="";
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].endsWith("n")||strArr[i].endsWith("k")){
                ilkHarfler+=strArr[i].charAt(0);


            }
        }
        return ilkHarfler;
}
}