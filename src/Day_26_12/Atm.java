package Day_26_12;

import java.util.Scanner;

public class Atm {

    static Scanner scan = new Scanner(System.in);
    static String KartNo = "1234123412341234";
    static String sifre = "1234";
    static double bakiye = 50000;


    public static void main(String[] args) {
        giris();

    }

    private static void giris() {
        System.out.println("Kart numarasi giriniz");
        String girilenKartNo = scan.nextLine().replace(" ", "");
        System.out.print("Sifre giriniz: ");
        String girilenSifre = scan.next();

        if (girilenSifre.equals(sifre) && girilenKartNo.equals(KartNo)) {
            menu();
        } else {
            System.out.println("Kart No veya sifre hatali!!!");
            scan.nextLine();//Dummy----------------> ard arda kullanilan scanner objelerinde
            // olusan hatayi onlemek icin kullanilir
            giris();
        }
    }

    private static void menu() {
        System.out.println("*****WISEQUARTER BANK*****\n" +

                "1.Bakiye sorgula\n" + "2.para yatirma\n" + "3.para çekme\n" + "4.para gonderme\n" + "5.sifre değiştirme\n" + "6.cikis islemleri\n" + "Seciminiz: ");


        int secim = scan.nextInt();
        switch (secim) {
            case 1: {
                bakiyeSorgula();
                break;
            }
            case 2: {
                System.out.print("Yatirmak istediginiz tutari giriniz");
                double miktar = scan.nextDouble();
                paraYatirma(miktar);
                break;
            }
            case 3: {
                paracekme();
            }
            break;
            case 4: {
                paraGonderme();
                break;
            }
            case 5: {
                sifreDegistir();
                break;
            }
            case 6: {
                System.out.println("**********Gule Gule***********");
                System.exit(0);
            }

            default: {
                System.out.println("Yanlis deger girdiniz");
                menu();
            }

        }
    }

    private static void sifreDegistir() {
        System.out.println("Eski sifreyi giriniz");
        String eSifre = scan.next();
        if (eSifre.equals(sifre)) {
            System.out.println("Yeni sifre giriniz");
            sifre = scan.next();
            scan.nextLine();
            giris();
        } else {
            System.out.println("Eski sifreyi yanlis girdiniz!!!");
            sifreDegistir();
        }
    }

    private static void paraGonderme() {
        scan.nextLine();
        System.out.println("Iban No giriniz(Iban No Tr ile baslamali");
        String iban = scan.nextLine().toUpperCase().replace(" ", "");

        if (iban.length() == 26 && iban.startsWith("TR")) {
            System.out.println("Gonderilecek miktari giriniz");
            double miktar = scan.nextDouble();
            if (miktar <= bakiye) {
                bakiye -= miktar;
                bakiyeSorgula();
            } else {
                System.out.println("Gondermek istediginiz miktar Bakiyeden buyuk");
                paraGonderme();

            }
        }


    }


    private static void paracekme() {
        System.out.println("Cekmek istediginiz miktari giriniz");
        double miktar = scan.nextDouble();
        if (miktar <= bakiye) {
            bakiye -= miktar;
            bakiyeSorgula();
        } else {
            System.out.println("Cekmek istediginiz miktar bakiyeden buyuk!!!");
            paracekme();
        }
    }

    private static void paraYatirma(double miktar) {
        bakiye += miktar;
        bakiyeSorgula();
    }

    private static void bakiyeSorgula() {
        System.out.println("Bakiyeniz: " + bakiye + "TL");
        menu();
    }

}


