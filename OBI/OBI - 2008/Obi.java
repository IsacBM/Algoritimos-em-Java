/*------------------------------------------------------------------------------|
                                   OBI
                        (OBI2008, Fase 1, Nível 1)

O principal prêmio da Olimpíada Brasileira de Informática é o convite para 
os cursos de programação oferecidos no Instituto de Computação da Unicamp, 
com todas as despesas pagas pela Fundação Carlos Chagas, patrocinadora da OBI.
São convidados apenas os competidores que atingem um certo número mínimo de
pontos, consideradas as duas fases de provas.
Você foi contratado pela Coordenação da OBI para fazer um programa que, dados
os números de pontos obtidos por cada competidor em cada uma das fases, e o 
número mínimo de pontos para ser convidado, determine quantos competidores 
serão convidados para o curso na Unicamp. Você deve considerar que:
todos os competidores participaram das duas fases;
o total de pontos de um competidor é a soma dos pontos obtidos nas duas fases;
Por exemplo, se a pontuação mínima para ser convidado é 435 pontos, um competidor
que tenha obtido 200 pontos na primeira fase e 235 pontos na segunda fase será
convidado para o curso na Unicamp. Já um competidor que tenha obtido 200 pontos
na primeira fase e 234 pontos na segunda fase não será convidado.
Entrada:
A entrada contém um único conjunto de testes, que deve ser lido do dispositivo
de entrada padrão (normalmente o teclado). A primeira linha da entrada contém
dois números inteiros N e P, representando respectivamente o número de competidores
e o número mínimo de pontos para ser convidado. Cada uma das N linhas seguintes contém
dois números inteiros X e Y indicando a pontuação de um competidor em cada uma das fases.
Saída:
Seu programa deve imprimir na saída padrão uma única linha contendo um único inteiro, 
indicando o número de competidores que serão convidados a participar do curso na Unicamp. */
------------------------------------------------------------------------------|
//                          :Solução Encontrada:
------------------------------------------------------------------------------|
// Início; @Isac B.M
import java.util.Scanner;
  class Principal {
    public static void main(String[] args) {
      Scanner Zacks = new Scanner(System.in);
// Variáveis 1;
        int Numero_De_Competidores = Zacks.nextInt();
        int Número_Mínimo_De_Pontos = Zacks.nextInt();
// Variável Auxiliar; Ela vai guardar quantos participantes atingiram os pontos mínimos.
        int aux = 0;
// Estrutura de Repetição; Ela vai receber os valores.
        for (int i = 0; i < Numero_De_Competidores; i++) {
// Variáveis 2; Leitura dos pontos.
            int Pontos1 = Zacks.nextInt();
            int Pontos2 = Zacks.nextInt();
            int result = Pontos1 + Pontos2;
// Verificação 1; Ela verifica se o participante atingiu a quantidade de pontos sufuciente.
            if (result == Número_Mínimo_De_Pontos || result > Número_Mínimo_De_Pontos) {
                aux++;
            }
        }
        System.out.println(aux);
    }
}
// Fim...
