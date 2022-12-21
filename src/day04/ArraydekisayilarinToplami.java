package day04;

public class ArraydekisayilarinToplami {

    //Create an array of 5 floats and calculate their sum.//5 tane float tan olusan bir array olusturup toplayin
    public static void main(String[] args) {
 // float[] numbers = new float[5];

  float[] numbers = {1.1f,2.0f,3.2f,5.0f,7.5f};

  float toplam = 0 ;
        System.out.println("+++++++++++++++++++++++FOR LOOP ILE++++++++++++++++++++++++++++");

        for (int i = 0; i <numbers.length ; i++) {
            toplam+=numbers[i];

        }
        System.out.println(toplam);


        System.out.println("++++++++++++++++++++++WHILE ILE+++++++++++++++++++++++++++++++++++++");


        toplam=0;
        int index=0;
        while (index<numbers.length){
            toplam+=numbers[index];
            index++;
        }
        System.out.println(toplam);


        System.out.println("++++++++++++++++++++++WHILE ILE 2+++++++++++++++++++++++++++++++++++++");


        toplam=0;
        int ind=numbers.length-1;
        while (ind>=0){        //sondan basladik
            toplam+=numbers[ind];
            ind--;
        }
        System.out.println(toplam);






    }
}
