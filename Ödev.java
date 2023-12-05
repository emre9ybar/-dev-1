package Ödev;

import java.util.Scanner;
public class Ödev {
    public static void main(String[] args) {
//ödev 1 -

      Scanner scan = new Scanner(System.in);
        int n1 , n2 ,select ;

        System.out.print("ilk sayıyı giriniz : ");
        n1 = scan.nextInt();

        System.out.print("ikinci sayıyı giriniz : ");
        n2 = scan.nextInt();

        System.out.print("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme\n");
        System.out.print("seçiminiz :");
        select = scan.nextInt();
        switch (select) {
            case 1 :
                System.out.println("toplama : "+(n1+n2) );
                break;

            case 2 :
                System.out.println("çıkarma : " +(n1-n2));
                break;

            case 3 :
                System.out.println("çarpma :"+(n1*n2));
                break;

            case 4 :
                boolean kosul3= (4==select);
                System.out.println("bölme : " +(n1/n2));
                break;

            default:
                System.out.println(("hatalı giriş yaptınız "));

                System.out.println();

 //   ödev 2-
                   System.out.print("Sayıyı Giriniz :");
        int girilensayi=scan.nextInt();
        int result=0;

        if (girilensayi%2==0){
            System.out.println("çift sayıdır :" +girilensayi);}else {
            System.out.println("Tek sayıdır :" + girilensayi);


        //ödev 3-*/ Bankada  krediye göre faiz belirleme .
                int bankvisa;
                System.out.print("Çekmek İstediğiniz Kredi Tutarını Giriniz :");
                bankvisa=scan.nextInt();

                double result0=bankvisa*0.10;
                double result1=bankvisa*0.20;
                double result2=bankvisa*0.30;

                double değişken2,değişken1,değişken0;

                if (bankvisa <= 100000){ değişken2=bankvisa+result2;
                    System.out.println("Kredi Tutarınız :"+result2+" TL\nToplam Tutar :" +değişken2+" TL");}
                else if (bankvisa < 300000) {değişken1=bankvisa+result1;
                       System.out.println("Kredi Tutarınız  :"+result1+" TL  \nToplam Tutar :" +değişken1+" TL");

                } else if (bankvisa > 300001) {değişken0=bankvisa+result0;
                    System.out.println("Kredi Tutarınız  :"+result0+" TL \nToplam Tutar :" +değişken0+ " TL");

                }

//ödev 4
        double mat , fen ,turkce;

        System.out.print("Matemetik Notunuz :");
        mat=scan.nextDouble();
        System.out.print("Fen Notunuz :");
        fen=scan.nextDouble();
        System.out.print("Turkçe Notunuz :");
        turkce=scan.nextDouble();

        double total=mat+turkce+fen;
        double total2=total/3;
        System.out.println("Not Ortalamanız :"+total2);

        //ödev 5-

        int üst,alt;

        System.out.print("Üssü Sayıyı giriniz :");
        üst=scan.nextInt();
        System.out.print("Alt Sayıyı Giriniz :");
        alt=scan.nextInt();
        int total1=1;
        for (int i = 0; i <üst;i++){total1*=alt;

            } System.out.println("Sonuc :"+total);


    //ödev 6 -

        int numara1,numara2,numara3;

        System.out.print("numara1 :");
        numara1=scan.nextInt();
        System.out.print("numara2 :");
        numara2=scan.nextInt();
        System.out.print("numara3 :");
        numara3=scan.nextInt();

        if (numara1 > numara2 && numara1 > numara3) {
            System.out.println("en büyük sayı: " + numara1);
        } else if (numara2 > numara1 && numara2 > numara3) {
            System.out.println("en büyük sayı: " + numara2);
        } else if (numara3 > numara1 && numara3 > numara2) {
            System.out.println("en büyük sayı: " + numara3);
        } else {
            System.out.println("hatalı giriş");
        }

    }
        }}}



















































































