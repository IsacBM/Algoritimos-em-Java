// Início; @Isac B.M
import java.util.Scanner;
  class Obi {
    public static void main(String[] args) {
      Scanner Zacks = new Scanner(System.in);
// Variáveis 1;
        int numero_De_Competidores = Zacks.nextInt();
        int NúmeroMínimo_De_Pontos = Zacks.nextInt();
// Variável Auxiliar; Ela vai guardar quantos participantes atingiram os pontos mínimos.
        int aux = 0;
// Estrutura de Repetição; Ela vai receber os valores.
        for (int i = 0; i < numero_De_Competidores; i++) {
// Variáveis 2;
            int Pontos1 = Zacks.nextInt();
            int Pontos2 = Zacks.nextInt();
            int result = Pontos1 + Pontos2;
// Verificação 1; Ela verifica se o participante atingiu a quantidade de pontos sufuciente.
            if (result == NúmeroMínimo_De_Pontos || result > NúmeroMínimo_De_Pontos) {
                aux++;
            }
        }
        System.out.println(aux);
    }
}
// Fim...