package practice03;

import java.util.Scanner;

public class C05DoWhileLoop {

    public static void main(String[] args) {

              /*
          Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
          Kullaniciya bitirmek istediginde 0'a basmasini soyleyin

          kullanici bitirmek istediginde
          toplam kac adet pozitif tam sayi girdigini
          ve bunlarin toplaminin kac oldugunu yazdirin

          Kullanici negatif sayi girerse
          "negatif sayi kullanamazsiniz " yazdirin
          bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */
        //baslangic degeri
//                do{
//                    calisacak kodlar
//                            artirma/azaltma
//
//                }while(loop calisma kurali);


        Scanner scan = new Scanner(System.in);

        int total = 0;
        int count = 0;
        do {
            System.out.print("Lutfen bir sayi giriniz : ");

            int num = scan.nextInt();

            System.out.println("Bitirmek icin 0 a basiniz");

            if (num == 0) {
                break;

            } else if (num < 0) {

                System.out.println("Negatif sayi kullanamzsin");
                continue;
            }


                total+=num;
                count++;

        } while (true);

        System.out.println("Giridiginiz sayilarin toplami : " + total);
        System.out.println("Girdiginiz sayi adeti : " + count);


    }
}
