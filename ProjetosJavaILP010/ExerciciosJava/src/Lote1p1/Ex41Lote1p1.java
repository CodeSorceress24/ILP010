package Lote1p1;
/* 
Programa: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
public class Ex41Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        int dado1, dado2;
        StringBuilder resultados = new StringBuilder();
        // processamento de dados: verificar todas as combinações de dois dados.
        for (dado1 = 1; dado1 <= 6; dado1++) {
            for (dado2 = 1; dado2 <= 6; dado2++) {
                if (dado1 + dado2 == 7) {
                    resultados.append("(").append(dado1).append(", ").append(dado2).append(")\n");
                }
            }
        }
        // saída de dados.
        System.out.println("Todas as possibilidades de 2 dados que somam 7:");
        System.out.print(resultados.toString());
    }
}