package practice01;

public class C02Ortalama {
public static double ortalamaBul(double a,double b,double c,double d,double e){
    return (a+b+c+d+e)/5;
}
    public static void main(String[] args) {

          /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
        ortalama nasıl hesaplanır -> tum sayıları topla, sayı adedine böl
     */
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;
        System.out.println((num1+num2+num3+num4+num5)/5);

        Double ortalama;
        ortalama = ortalamaBul(num1,num2,num3,num4,num5);
        System.out.println("ortalama = " + ortalama);


    }
}
