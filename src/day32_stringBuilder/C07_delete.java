package day32_stringBuilder;

public class C07_delete {

    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java her zaman guzel");

        sb.delete(8,9);
        System.out.println(sb); // Java herzaman guzel
       //  8 basla 9 dahil degil yapip her zaman yazisini bitisik yazdik aradaki bosluk silindi


        sb.deleteCharAt(7);
        System.out.println(sb); // Java hezaman guzel

        // bastan baslayarak her loop da ilk harfi silip kalani yazdiralim


        int son=sb.length();
        for (int i = 0; i <son ; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);


        }

   /*
               ava hezaman guzel
               va hezaman guzel
                a hezaman guzel
                hezaman guzel
                hezaman guzel
                ezaman guzel
               zaman guzel
                aman guzel
               man guzel
               an guzel
              n guzel
               guzel
              guzel
               uzel
              zel
              el
              l



    */



    }
}
