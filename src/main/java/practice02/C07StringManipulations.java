package practice02;

import java.util.Scanner;

public class C07StringManipulations {

    public static void main(String[] args) {


         /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ad ve soyadinizi aralarinda bir bousluk olacak sekilde girin." +
                "\n NOT: Yalnizca bir ad ve soyad girilmeli");

        String adSoyad = scan.nextLine();
        //Ali Can ==> spaceIdx : 3
        int spaceIdx = adSoyad.indexOf(" ");

        //substring 2 parametre ile kullanilirsa ilk index dahil , ikinci index harictir
        //substring tek parametre ile kullanilirsa indx dahil stringin sonuna kadar alir

        String ad = adSoyad.substring(0,spaceIdx);//ilk index dahil ikinci index harictir
        String soyad = adSoyad.substring(spaceIdx+1);

        String ad2 = ad.toUpperCase().charAt(0) + ad.toLowerCase().substring(1);
        String soyad2 = soyad.toUpperCase().charAt(0) + soyad.toLowerCase().substring(1);
        System.out.println(ad2);
        System.out.println(soyad2);




    }
}
