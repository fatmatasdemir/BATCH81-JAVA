package day33_encapsulation;

public class Tasit {

   private String tasitTuru;
    private boolean muayenesiVarMi;
    private  int yil;


    public String getTasitTuru() {
        return tasitTuru;



    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
        /*
         //return olmadığı icin bu methodun cağırıldığı
         tasitrunner classinden yazdirilamaz
    //burada bir satırlık islem yapıyor
    o bir satırlık islemde bizim gönderdiğimiz
    parametreyi instence variable a atıyor.

         */
    }

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }

    /*
    boolean variable lar icin olusturulan getter methodu

    isVariableIsmi seklinde
     */

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
