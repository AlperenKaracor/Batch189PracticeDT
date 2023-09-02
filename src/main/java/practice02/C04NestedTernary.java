package practice02;

import java.util.Scanner;

public class C04NestedTernary {

    public static void main(String[] args) {


         /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");
        int num1 = scan.nextInt();

        System.out.println("Lutfen bir tamsayi giriniz");
        int num2 = scan.nextInt();

       Object result = num1 == num2 ? "Sayilar birbirine esit" : num1<num2 ? num1 : num2 ;
        System.out.println(result);




    }
}
