package Lote1p1;
/* 
Programa: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex11Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        double raio, comprimento; 
        // entrada de dados.
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
        // processamento de dados.
        comprimento = 2*Math.PI*raio;
        // saída de dados.
        JOptionPane.showMessageDialog(null, "O comprimento da circunferência é de: " + comprimento + ".");
    }
}