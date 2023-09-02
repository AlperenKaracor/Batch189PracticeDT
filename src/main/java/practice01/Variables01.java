package practice01;

public class Variables01 {

    public static void main(String[] args) {


        //1 (int) bir variable(yas)  olustur ve yazdır
        //2 (int) bir variable(sayi)  olustur ve yazdır
        //3 konsola sayi = 50 seklinde yazdır
        //4 yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala
        //5 String bir variable olusturalım (isim)
        //6 isim variable ını etiketıyle yazdır
        //7 onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala
        //8 onunIsmi variable'ını etiketiyle yazdır
        //9 isim variable'ının degerini guncelle
        //10 isim ve onunIsmi variable'larını yazdır

        //1
        int yas = 35;
        System.out.println("Yas : " + yas);
        //2
        int sayi = 44;
        System.out.println("Sayi : " + sayi);
        //3
        int sayi2 = 50;
        System.out.println("Sayi = " + sayi2);

        System.out.println("sayi = " + sayi);
        //4
        int benimYasim = yas;
        System.out.println("benimYasim = " + benimYasim);
        //5
        String isim = "Can";
        //6
        System.out.println("isim = " + isim);
        //7
        String onunIsmi = isim;
        //8
        System.out.println("onunIsmi = " + onunIsmi);
        //9
        isim = "Ali";
        System.out.println("isim = " + isim);

        System.out.println("onunIsmi = " + onunIsmi);


    }
}
