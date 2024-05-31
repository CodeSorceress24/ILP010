package Lote1p1;
/* 
Programa: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
public class Ex42Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        double soma = 0.0;
        // processamento de dados.
        for (int i = 1; i <= 50; i++) {
            double termo = (double) i / (2 * i - 1);
            soma += termo;
        }
        // saída de dados.
        System.out.printf("A soma da série 1 + 2/3 + 3/5 + ... + 50/99 é: %.6f%n", soma + ".");
    }
}