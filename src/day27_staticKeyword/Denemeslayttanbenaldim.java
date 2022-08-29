package day27_staticKeyword;

public class Denemeslayttanbenaldim {

    // KOD OKUMA SORUSU
    // asagidaki class calistirildiginda output ne olur


           static  int count=0;
         public void increment(){
        count++;
        }
        public static void main(String[] args) {  // 1.sira
            Denemeslayttanbenaldim obj1=new Denemeslayttanbenaldim(); //2.sira //
          Denemeslayttanbenaldim obj2=new Denemeslayttanbenaldim(); //3.sira

          obj1.increment(); // 4.sira  // ilk count=0 burada 11 satira gider count  1 artirilir


            obj2.increment(); // 5.sira  // suan count =1 11 satira gider count 1 artar

        System.out.println("obj1 : count is=" + obj1.count); // 2   // 6.sira
        System.out.println("obj2 : count is=" + obj2.count); // 2   // 7.sira
    }
}
















