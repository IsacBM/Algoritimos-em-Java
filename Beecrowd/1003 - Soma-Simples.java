/*
[=================================================================================]
|                             Questão: Soma Simples                               |
|                     Adaptado por Neilor Tonin, URI  Brasil                      |
[=================================================================================]
|Timelimit: 1                                                                     |
|Leia dois valores inteiros, no caso para variáveis A e B. A seguir,calcule a soma|
|entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.  |
[=================================================================================]
|Entrada:                                                                         |
|O arquivo de entrada contém 2 valores inteiros.                                  |
[=================================================================================]
|Saída:                                                                           |
|Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco| 
|antes e depois da igualdade seguido pelo valor correspondente à soma de A e B.   |
|Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,|
|caso contrário, você receberá "Presentation Error".                              |
[=================================================================================]
|                                    :Código:                                     |
[=================================================================================]*/

// Início: @IsacBM
import java.util.Scanner;
  class Main {
     public static void main(String[] args) {
        Scanner Zacks = new Scanner(System.in);
// Variáveis:
          int Num1 = Zacks.nextInt();
            int Num2 = Zacks.nextInt();
// Resultado:
             System.out.println("SOMA = " + (Num1 + Num2));
      }
  }
//Fim...
/*
[=================================================================================]
*/
