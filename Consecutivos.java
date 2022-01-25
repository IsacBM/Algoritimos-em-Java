// Início;
import java.util.Scanner;
 public class Consecutivos {
  public static void main(String[] args) {
   Scanner Zak = new Scanner(System.in);
// Variável que define o 'Tamanho';
    int N = Zak.nextInt();
// Variáveis Auxiliares;
     int SeqAtual = 1;
      int SeqMaior = 1;
       int Anterior = 0;
// Estrutura de Repetição;
        for(int i=0;i<N;i++) {
// Variável que recebe os valores;
	     int num = Zak.nextInt();
// Verificações 1;
	      if (i > 0) {
	       if (Anterior == num) { 
            SeqAtual++; 
           }
// Verificações 2; Verifica se a sequência acabou ou se é o ultimo número lido.
		    if(Anterior != num || i == N-1) {
			  if(SeqAtual > SeqMaior) {
               SeqMaior = SeqAtual; 
              }
			 SeqAtual = 1;
		    }
          }
          Anterior = num;
        }
      System.out.println(SeqMaior);
    }
}
// Fim...