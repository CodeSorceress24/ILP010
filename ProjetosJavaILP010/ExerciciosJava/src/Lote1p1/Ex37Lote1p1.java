package Lote1p1;
/* 
Programa: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import javax.swing.JOptionPane;

public class Ex37Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        int N;
        StringBuilder serie = new StringBuilder();
        // entrada de dados.
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        // processamento de dados.
        int primeiro = 0;
        int segundo = 1;
        int proximo;
        // cálculo da série de Fibonacci até o N-ésimo termo.
        if (N > 0) {
            serie.append(primeiro);
            if (N > 1) {
                serie.append(", ").append(segundo);
                for (int i = 2; i < N; i++) {
                    proximo = primeiro + segundo;
                    serie.append(", ").append(proximo); // Adiciona o próximo termo à série
                    primeiro = segundo;
                    segundo = proximo;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "O número deve ser maior que zero.");
            return;
        }
        // saída de dados.
        JOptionPane.showMessageDialog(null, "Série de Fibonacci até o " + N + "º termo:\n" + serie.toString());
    }
}