package practice04;

public class C05Varargs {

    public static void main(String[] args) {

        // kac tane kelime verilirse verilsin
        // iclerinden en uzun olanı yazdıran bir method olusturun
        // bu methodun access modifier'ını public yapıp aynı packagagedeki faklı bir classdan calıstırınız

        String st1 = "Ali";
        String st2 = "Veli";
        String st3 = "Hakan";
        String st4 = "Abdurrahman";
        String st5 = "Melike";
        String st6 = "Gulistan";
        
        enUzunKelime(st1,st2,st3,st4,st5,st6);


    }

    public static void enUzunKelime(String... str) {

        String enUzunKelime = "";

        for ( String each :  str) {

            if(each.length()>enUzunKelime.length()){
                enUzunKelime=each;

            }

        }

        System.out.println("En uzun kelime = " + enUzunKelime);


    }
}
