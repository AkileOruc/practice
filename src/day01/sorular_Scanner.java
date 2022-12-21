package day01;

import java.util.Scanner;

public class sorular_Scanner {

     /*Soru 4-)   SCANNER
       Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.*/
     public static void main(String[] args) {


    Scanner scan= new Scanner(System.in);
       System.out.println("Lutfen bir sayi giriniz");
    double sayi= scan.nextDouble();
         System.out.println("sayinin kupunun yarisi :" + (sayi*sayi*sayi)/2) ;

     }

}
