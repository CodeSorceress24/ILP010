package Lote1p1;
/* 
Programa: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
public class Ex45Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        double soma = 0.0;
        int sinal = 1;
        // processamento de dados.
        for (int i = 1; i <= 15; i++) {
            double termo = (double) i / (i * i);
            soma += sinal * termo;
            sinal *= -1; // Alterna o sinal
        }
        // saída de dados.
        System.out.printf("A soma da série 1 - 2/4 + 3/9 - 4/16 + ... + 15/225 é: %.6f%n", soma + ".");
    }
}