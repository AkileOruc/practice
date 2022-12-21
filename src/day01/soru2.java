package day01;

import java.util.Scanner;

public class soru2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz:");
        char harf = scan.next().toLowerCase().charAt(0);


        switch (harf) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Girilen harf sesli harftir.");
                break;
            default:
                System.out.println("Girilen harf sesli harf değildir.");
        }

        /* Kullanıcıdan bir harf isteyin.
        Kullanıcı birden fazla harf girerse ilk harfin alınmasını sağlayın. (Ö,İ,Ü işleme alınmasın)
        Ayrıca girilen harfte büyük küçük olmasını göz ardı edin.
                */
        System.out.println("**********************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        String kullaniciHarfi = sc.next().toLowerCase();
        String sesli = "aeiou";
        if (sesli.contains(kullaniciHarfi.substring(0, 1))) {
            System.out.println("harf sesli bir harftir");
        } else {
            System.out.println("Sesli harf degildir");
        }

    }
}









