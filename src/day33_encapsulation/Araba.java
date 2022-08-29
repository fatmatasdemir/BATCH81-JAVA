package day33_encapsulation;

public class Araba {

     String  marka="Marka belirtilmedi";// markanin access modfieri default oldugundan access mo.old.
                                       // package icerisinden kullanilabilir
    private String model="Model belirtilmedi";

     private String yakit="Elektrikli";  // tum arabalar elektrikli ise bu variablenin
    // degistirilmemesi
    // private yaptigimiz model ve yakit variable larina erisim yetkilendirelim
 // generate tikla  setter tikla  model sec 11.satir olustu
    // generate tikla getter tikla yakit sec 17.satir olustu

    /*
    public String getYakit() {
        return yakit;
     */
// modele deger atanabilsin ama gorulmesin(setter)
    public void setModel(String model) {
        this.model = model;

    }

    // YAKIT gorulsun ama deger atanamasin(getter)
    public String getYakit() {
        return yakit;

    }


}
