package Lote1p1;
/* 
Programa: Receba 2 números reais. Calcule e mostre a diferença desses valores.
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import javax.swing.JOptionPane;
public class Ex10Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        double num1, num2, diferença;
        // entrada de dados.
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 1º número: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 2º número: "));
        // processamento de dados.
        diferença = num1-num2;
        // saída de dados.
        JOptionPane.showMessageDialog(null, "A diferença entre os valores é de: " + diferença + ".");
    }
}