package Lote1p1;
/* 
Programa: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 	1	2	3	4	...	64
Qdte:	1	2	4	8	...	N
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
public class Ex39Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        int i;
        double totalGraos = 0;
        double graosPorCasa = 1;
        // processamento de dados.
        for (i = 1; i <= 64; i++) {
            totalGraos += graosPorCasa;
            graosPorCasa *= 2;
        }
        // saída de dados.
        System.out.print("A quantidade total de grãos no tabuleiro de xadrez é: " + totalGraos + ".");
    }
}