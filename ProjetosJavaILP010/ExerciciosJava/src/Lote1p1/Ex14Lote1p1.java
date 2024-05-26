package Lote1p1;
/* 
Programa: Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex14Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        int primeiroAngulo, segundoAngulo, terceiroAngulo;
        // entrada de dados.
        primeiroAngulo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro ângulo do retângulo: "));
        segundoAngulo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo ângulo do retângulo: "));
        // processamento de dados. 
        terceiroAngulo = 180 - primeiroAngulo - segundoAngulo;
        if (primeiroAngulo <= 0 || segundoAngulo <= 0 || terceiroAngulo <= 0 || primeiroAngulo + segundoAngulo + terceiroAngulo > 180) {
            JOptionPane.showMessageDialog(null, "Não forma triângulo."); // lembrando que, no caso do triângulo, a soma dos 3 ângulos deve resultar em 180°.
        }else{
        // saída de dados.
        JOptionPane.showMessageDialog(null, "O valor do terceiro ângulo é de: " + terceiroAngulo + "°.");
        }
    }
}