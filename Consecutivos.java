/*                           Consecutivos
                      (OBI2012, Fase 1, Nível 1)
Em um sorteio que distribui prêmios, um participante inicialmente sorteia um inteiro N e depois N valores. 
O número de pontos do participante é o tamanho da maior da sequência de valores consecutivos iguais. 
Por exemplo, suponhamos que um participante sorteia N = 11 e, nesta ordem, os valores.
30, 30, 30, 30, 40, 40, 40, 40, 40, 30, 30
Então, o participante ganha 5 pontos, correspondentes aos 5 valores 40 consecutivos. 
Note que o participante sorteou 6 valores iguais a 30, mas nem todos são consecutivos.
Sua tarefa é ajudar a organização do evento, escrevendo um programa que determina o número de pontos de um participante.

Entrada:
A primeira linha da entrada contém um inteiro N, o número de valores sorteados. 
A segunda linha contém N valores, V1, V2, . . . , VN, na ordem de sorteio, separados por um espaço em branco.

Saída:
Seu programa deve imprimir apenas uma linha, contendo apenas um inteiro, indicando o número de pontos do participante.
|---------------------------------------------------------|
| Exemplo de Entrada:              | Exemplo de Saída:    |
| 11                               | 5                    |
| 30 30 30 40 40 40 40 40 30 30 30 |                      |
|--------------------------------- | ---------------------|
| 14                               | 7                    |
| 1 1 1 20 20 20 20 3 3 3 3 3 3 3  |                      |
|---------------------------------------------------------| */
                     /*Código em Java*/
/*---------------------------------------------------------*/

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
