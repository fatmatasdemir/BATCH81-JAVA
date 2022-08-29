package day27_staticKeyword;

public class Deneme2slayttanbenaldim {
    int x;
    static int y;


    // asagidaki int i ilk olarak 2 olur sonra 3 olur
    Deneme2slayttanbenaldim(int i){ // 3.sira  // tekrar gelir buraya 7.sira
        x+=i; // 4.sira  // tekrar 8.sira
        y+=i; // 5.sira  // tekrar 9.sira
    }
    public static void main(String[] args) { // 1.sira
        new Deneme2slayttanbenaldim(2); // 2.sira

        Deneme2slayttanbenaldim dnm=new Deneme2slayttanbenaldim(3);  // 6.sira
        System.out.println(dnm.x + "," + dnm.y); // x,y -----> 3,5 olur  // 10.sira




    }









}
