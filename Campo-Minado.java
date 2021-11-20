import java.util.Scanner;
   class Main {
     public static void main(String[] args) {
        Scanner Zak = new Scanner(System.in);
           int Num = Zak.nextInt();
            int[] Minas = new int[Num];
             for (int i = 0; i < Minas.length; i++) {
              Minas[i] = Zak.nextInt();
             }
             for (int i = 0; i < Minas.length; i++) {
              int mina_explosiva = 0;
               if (i == 0) {
                if (Minas[i] == 1 || Minas[i+1] == 1) {
                 mina_explosiva++;
                }
               }
                if (i > 0 && i < Minas.length -1) {
                 if (Minas[i-1] == 1) {
                  mina_explosiva++;
                 }
                  if (Minas[i] == 1) {
                   mina_explosiva++;
                  }
                   if (Minas[i+1] == 1) {
                    mina_explosiva++;
                   }
                 }
                  if (i == Minas.length-1) {
                   if (Minas[i-1] == 1 || Minas[i] == 1) {
                    mina_explosiva++;
                   }
                  }
                  System.out.println(mina_explosiva);
        }
        
    }
}