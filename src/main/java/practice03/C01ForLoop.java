package practice03;

import java.util.Scanner;

public class C01ForLoop {

    public static void main(String[] args) {

        /*
        Kullanicidan bir kelime sisteme girmesini isteyiniz
        kelimede ilk c harfi rastlanana kadar a harflerinin sayisiniz yazdiriniz

         */


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz ");

        String kelime = input.next();
        //Stringdeku characterleri tek tek nasil alirim ==> charAt(index)




        int sayac = 0;
        for (int i = 0; i < kelime.length(); i++) {

            if(kelime.charAt(i) == 'a'){
                sayac++;
            } else if (kelime.charAt(i) == 'c') {
                break;
            }
        }

        System.out.println("Ilk c harfine kadar olan a harflerinin sayisi : " + sayac);


    }
}
