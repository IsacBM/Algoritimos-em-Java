// Início;
import java.util.Scanner;
public class Principal {
 public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
// Variável;
   int ValorDeEntrada = teclado.nextInt();
// Verificação 1; Se caso o valor da 'Entrada' Seja maior que 2, ela executa.
    if (ValorDeEntrada >= 2) {
// Estrutura de Repetição Tipo 'For'; Ela vai imprimir a lista!
      for (int n = 2; n <= ValorDeEntrada; n++) {
// Verificação 2; Ela verifica se o numero é 'Par'.
        if (n % 2 == 0) {
         System.out.println(n);
        }
      }
    }
// Verificação 3; Caso o 'valor informado' seja menor que '2'...
     else if (ValorDeEntrada <= 2) {
         System.out.println("Informe um valor superior a 2!");
     }
 }
}
// Fim...