package Lote1p1;
/* 
Programa: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import javax.swing.JOptionPane;
public class Ex22Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        int valor1, valor2;
        // entrada de dados.
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor inteiro:"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor inteiro (diferente do primeiro):"));
        // verificação para garantir que os valores são diferentes.
        if (valor1 == valor2) {
            JOptionPane.showMessageDialog(null, "Os valores devem ser diferentes.");
        } else {
            // processamento de dados e saída de dados.
            if (valor1 < valor2) {
                JOptionPane.showMessageDialog(null, "Valores em ordem crescente: " + valor1 + ", " + valor2 + ".");
            } else {
                JOptionPane.showMessageDialog(null, "Valores em ordem crescente: " + valor2 + ", " + valor1 + ".");
            }
        }
    }
}