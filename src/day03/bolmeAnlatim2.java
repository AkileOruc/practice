package day03;

import java.util.Scanner;

public class bolmeAnlatim2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bolmek istediginiz sayiyi giriniz : ");
        int a = scan.nextInt();

        System.out.println("Lutfen bolen sayiyi giriniz : ");
        int b = scan.nextInt();

        System.out.println ( a + " / "+ b +" = " + bol(a, b));
        System.out.println ( bol(25, 5));
        System.out.println ( bol(32, 4));
        System.out.println ( bol(96, 3));
        System.out.println ( bol(100, 25));
        System.out.println ( bol(1765, 43));
        System.out.println ( bol(10934, 4374));

    }

    public static int bol(int bolunen, int bolen) {

        int bolum = 0;

        while(bolunen>=bolen){

            bolunen-=bolen;

            bolum++;
        }
        return bolum;
    }




}



