package day17_nestedForLoop;

public class C01_forloop {


    public static void main(String[] args) {



    // verilen Stringdeki kullanilan harfleri
    // tekrarsiz olarak yazdirip
    // kelimede kullanilan farkli harf sayisini veren bir method yaziniz

    String input = "Java her zaman güzel";    //Emsal/taka tuka
    tekrarsizYap(input);

}
    public static void tekrarsizYap(String input) {
        String benzersizinput = "";
        String islenecekKelime=input.replaceAll("\\W","");    // Javaherzamanguzel

        System.out.print(islenecekKelime.substring(0, 1));                      // ilk harf j
        benzersizinput+=islenecekKelime.substring(0,1);                         // j benzersizlere eklendi
        for (int i = 1; i < islenecekKelime.length(); i++) {                    // Benzersiz input=
            // her bir harfi tek tek aliyoruz sonra kullandik mi kontrol edip

            if (!benzersizinput.contains(islenecekKelime.substring(i,i+1))) {
                System.out.print(" ," + islenecekKelime.substring(i, i + 1));
                benzersizinput += islenecekKelime.substring(i, i + 1);
            }
        }
        System.out.println("");
        System.out.println("inpt: "+ input);
        System.out.println("benzersiz input :" + benzersizinput);


    }


}


















