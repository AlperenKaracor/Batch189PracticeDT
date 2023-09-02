package practice03;

import java.util.Scanner;

public class C03ForLoop {

    public static void main(String[] args) {

        /*
        Kullanicidan sisteme satir sayisini girmesini isteyiniz
        ve ardindan yildiz isaretini kullanrak bir dik ucgen cizin

        satir sayisi ===> 4           *
                                      * *
                                      * * *
                                      * * * *
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen satir sayisi giriniz ");//Tek seferlik istedigim icin loop icinde yazmadim
        int row = input.nextInt();

        for (int i = 0; i <= row; i++) {

            System.out.println();

            for (int j = 0; j < i; j++) {

                System.out.print("* ");
            }
        }
                
        



    }
}
