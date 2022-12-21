package day01;

import java.util.Scanner;

public class sorular_Scanner2 {

    public static void main(String[] args) {
       /* Soru 5-)   SCANNER
        Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan
        kodu yazın.
                Ipuclari:
        Google yaparak karenin alaninin ve cevresinin nasil bulundugunu ögrenin :-)*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz");
        double a = scan.nextDouble();
        System.out.println("Karenin alanı : " + a*a);
        System.out.println("Karenin cevresi: " + 4*a);




    }
}
