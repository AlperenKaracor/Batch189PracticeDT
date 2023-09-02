package practice04;

import java.util.Scanner;

public class C04FahrenheitToCelcius {

    public static void main(String[] args) {

        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //Not: fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen fahrenheit cinsinden sicaklik degerini giriniz : ");
        double fahrenheit = scan.nextDouble();

        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println(celsius);



    }

    public static double fahrenheitToCelsius(double fahrenheit) {

        // formül: c = (f-32)/1.8

        double celsius = (fahrenheit-32) / 1.8;

        return celsius;



    }
}
