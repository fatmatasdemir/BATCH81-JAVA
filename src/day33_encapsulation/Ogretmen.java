package day33_encapsulation;

public class Ogretmen {


       private String isim;
       private String soyisim;
       private  String brans;

       /*
       Bazen  de yetkileri sinirlamak degil de
       yapilan isi daha iyi tanimlamak icin
       encapsulation kullanilir

       Bu yaklasimi kullanan class'larda
       tum variable'lar  private yapilip
       hepsi icin getter ve setter olsuturulur.

  // generate tikla getter and setter tikla sonra  isim,soyisim,brans sec

        */

       public String getIsim() {
              return isim;
       }

       public void setIsim(String isim) {
              this.isim = isim;
       }

       public String getSoyisim() {
              return soyisim;
       }

       public void setSoyisim(String soyisim) {
              this.soyisim = soyisim;
       }

       public String getBrans() {
              return brans;
       }

       public void setBrans(String brans) {
              this.brans = brans;
       }
}
