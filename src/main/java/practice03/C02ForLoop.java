package practice03;

import java.util.Scanner;

public class C02ForLoop {

    public static void main(String[] args) {


        /*
        Kullanicidan sisteme 5 adet sayi girmesini isteyiniz
        Bu sayilardan birler basamagi 7 veya 9 olanlar haric digerlerinin toplamini bulunuz
           */

        Scanner scan = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {

            System.out.print("Lutfen sayi giriniz : ");
            int num = scan.nextInt();
            if(num%10 == 7 || num%10 == 9) {
                continue;
            }
           total =  num + total;
            }
        System.out.println(total);


        }



    }

