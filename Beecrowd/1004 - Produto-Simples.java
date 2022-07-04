/*
[==========================================================================================]
|                                   Beecrowd | 1004                                        |
|                           Questões: Produto Simples                                      |
|                          Adaptado por Neilor Tonin, URI  Brasil                          |
[==========================================================================================]
|Timelimit: 1                                                                              |
|Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua|
|esta operação à variável PROD.A seguir mostre a variável PROD com mensagem correspondente.|   
[==========================================================================================]
|Entrada:                                                                                  |
|O arquivo de entrada contém 2 valores inteiros.                                           |
[==========================================================================================]
|Saída:                                                                                    |
|Imprima a mensagem "PROD" e a variável conforme exemplo abaixo,com um espaço em branco    |
|antes e depois da igualdade. Não esqueça de imprimir o fim de linha após o produto, caso  |
|contrário seu programa apresentará a mensagem: “Presentation Error”.                      |
[==========================================================================================]
|                                        :Código:                                          |
[==========================================================================================]*/

// início: @IsacBM
import java.util.Scanner;
  class Main {
      public static void main(String[] args) {
          Scanner Zacks = new Scanner(System.in); 
// Variáveis:
          int Num1 = Zacks.nextInt();
          int Num2 = Zacks.nextInt();
// Resultado:
          System.out.println("PROD = " + (Num1 * Num2));
      }
  }
// Fim...
  /*
[==========================================================================================]
*/
