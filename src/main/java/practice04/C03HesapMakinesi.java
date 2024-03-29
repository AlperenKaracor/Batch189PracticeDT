package practice04;

import java.util.Scanner;

public class C03HesapMakinesi {

    public static void main(String[] args) {


        /*
        Basit 4 islem yapan bir hesap makinesi kodlayınız
        Kullanıcıcn yapacagi islemi islem sembolu ile( +  -  /  *  ) secmesini isteyiniz
        Kullanıcının 2 sayi girmesini isteyiniz
        Girilen islem ve sayilara gore dogru sonucu ekrana yazdırınız
        */


        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen yapmak istediginiz islemi seciniz : +, -, *, / kullaniniz \n Islem : ");

        char islem = scan.next().charAt(0);

        if (islem == '+' || islem == '-' || islem == '*' || islem == '/') {

            System.out.print("Lutfen islem yapmak istediginiz sayilari giriniz\nBirinci sayi : ");
            double sayi1 = scan.nextDouble();
            System.out.print("Ikinci sayi : ");
            double sayi2 = scan.nextDouble();


            hesapMakinesi(islem,sayi1,sayi2);


        } else {
            System.out.println("Hatali giris");
        }


    }

    private static void hesapMakinesi(char islem, double sayi1, double sayi2) {

        switch (islem){

            case '+':
                System.out.println(sayi1+ " + " + sayi2  +" = " + (sayi1 + sayi2));break;
            case '-':
                System.out.println(sayi1+ " - " + sayi2  +" = " + (sayi1 - sayi2));break;
            case '/':
                System.out.println(sayi1+ " / " + sayi2  +" = " + (sayi1 / sayi2));break;
            case '*':
                System.out.println(sayi1+ " * " + sayi2  +" = " + (sayi1 * sayi2));break;

        }



    }
}
