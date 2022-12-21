package Practice;

public class soru7 {
    // //1-1000 e kadar olan sayıların içinde mükemmel olanları yazdıran metodu yazınız

    public static void main(String[] args) {

            int toplam = 0;
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < i; j++) {
                if (i%j == 0) {
                    toplam+=j;
                }
            }
            if (toplam==i)
                System.out.println(i+" mukemmel sayidir");
            else
                System.out.println(i+"mukemmel sayi değildir");
            toplam=0;
        }
    }

        }


