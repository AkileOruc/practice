package day01;

import java.util.Scanner;

public class sorular_slack {
   /*Soru 1-)   SOUT/SYSO
   Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
   Ipuclari:
        * r=7;
        * Pi=3.14
            * Dairenin Cevresi : 2*Pi*r
        * Dairenin Alani : Pi*r*r                      */
   public static void main(String[] args) {

    int r=7;
    double Pi=3.14;
       System.out.println("Dairenin Alani: " + Pi*r*r);
       System.out.println("Dairenin Cevresi: " + Pi*2*r);


      /*    Soru-2)   SOUT/SYSO
       Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
               Ipuclari:
      * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
      * Dikdortgenin Alani : uzun kenar * kisa kenar    */

       double kisaKenar= 9;
       double uzunKenar= 18.5 ;
       System.out.println("Dikdortgenin Cevresi:" + 2 * (uzunKenar + kisaKenar));
       System.out.println("Dikdortgenin Alani:" + uzunKenar * kisaKenar);


     /*Soru 3-)   SCANNER
     Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
     Ipuclari:
      * Sayilarin ortalamasi: toplam/5        */

       Scanner scan =new Scanner(System.in);
       System.out.print("lutfen 5 tane sayi giriniz");
       double sayi1=scan.nextDouble();
       double sayi2=scan.nextDouble();
       double sayi3=scan.nextDouble();
       double sayi4=scan.nextDouble();
       double sayi5=scan.nextDouble();

       System.out.println("Sayilarin ortalamasi : "+ (sayi1+sayi2+sayi3+sayi4+sayi5)/5);










   }

}
