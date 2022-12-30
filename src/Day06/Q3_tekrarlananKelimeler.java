package Day06;

import java.util.Arrays;

public class Q3_tekrarlananKelimeler {
    public static void main(String[] args) {
        //Soru 30-)
//Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
//( mülakat sorusu )
//Örnek:
//String str="Javacokkolay"
//Yinelenen karakterler : [a, o, k]
//İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
//            Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıpkonteynıra atacaksınız
//            bu yüzden iç içe loop kullanmak mantıklı duruyor
        String str = "aavacokkolay";
        String yinelenenKarakterler = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i +1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && !yinelenenKarakterler.contains(str.charAt(i)+ ""))
                {
                    yinelenenKarakterler = yinelenenKarakterler + str.charAt(i);
                }
            }
        }
        String[] karakterler = yinelenenKarakterler.split("");
        System.out.println(Arrays.toString(karakterler));

    }
}


