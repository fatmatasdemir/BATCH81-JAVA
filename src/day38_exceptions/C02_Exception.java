package day38_exceptions;

public class C02_Exception {
    public static void main(String[] args) {

         /*
        try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz
                  islemleri yazmak icin kullanilir

        catch'den sonraki parantez karsilasmayi bekledigimiz exception
                  turunu Javaya soylemek icin kullanilir

        catch blogu  : Java'ya soyledigimiz exception(istisnai durum) gerceklesirse
                   Java'nin yapmasini istedigimiz islem

                   catch blogunun onundeki paranteze karsilasmayi bekledigimz exception yazabiliriz
                   veya her turlu exception'da devreye girmesini istiyorsak

                   tum exception'larin parent'i olan Exception yazabiliriz
         */

        int a= 1000;
        int b= 50;

        int sayac = 1;

        while(sayac<100){

            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("payda 0 oldu, dikkatli ol");
            }
            b--;
            sayac++;
        }
    }


}
