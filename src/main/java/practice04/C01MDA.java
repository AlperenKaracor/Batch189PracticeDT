package practice04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C01MDA {

    public static void main(String[] args) {


        /*
        arr[3][2] luk bir mdarray olusturun
        Arrayın elemanlarını kullanıcıdan alın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int [][] arr={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */

        int [][] arr = new int[3][2];

        System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]]

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {//outer array elemanlarini alacak

            for (int j = 0; j < arr[i].length; j++) {//inner array elemanlarini alacak

                System.out.print("Eklemek istediginiz tam sayiyi giriniz  :  ");
                 arr[i][j] = scan.nextInt();

            }

        }

        System.out.println(Arrays.deepToString(arr));

        int[] brr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {//dis arrary elemanlarini alcak

            int toplam = 0;

            for (int j = 0; j < arr[i].length; j++) {//elimdeki inner arrayin elemanlarini alacak

                toplam = toplam +  arr[i][j];

            }

            brr[i] = toplam;

        }

        System.out.println(Arrays.toString(brr));





    }
}
