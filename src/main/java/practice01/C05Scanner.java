package practice01;

import java.util.Scanner;

public class C05Scanner {

    public static int karesiniAl(int a){
        return a*a;

    }

     /*
    kullanıcıdan aldıgınız sayının karesini bulunuz bulunuz
    not:bir sayının karesi,sayının kendisi ile carpımına esittir
     */
     public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
         System.out.print("Lutfen bir sayi giriniz : ");
         int n = input.nextInt();
         n = karesiniAl(n);
         System.out.println("Sonuc : " + n);


     }
 }