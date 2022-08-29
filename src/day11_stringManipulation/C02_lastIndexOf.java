package day11_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";  // ornek Java  J buyuk harfle yazilmis
                                   // cumlede birden fazla yazmis der
                                  // java yazarsak kucuk harfle j kullanilmamis yazar


        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimaSonINDEX=cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("verilen kelime cumlede kullanilmamis");

        }else if (kelimeIlkIndex==kelimaSonINDEX)
        {

            System.out.println("verilen kelime cumlede sadece 1 kere kullanilmis");


        }else {
            System.out.println("verilen kelime cumlede birden fazla kullanilmis");

        }





}
}
