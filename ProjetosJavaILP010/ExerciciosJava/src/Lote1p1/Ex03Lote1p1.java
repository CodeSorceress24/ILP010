package Lote1p1;
/* 
Programa: Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
Programador: Marcela Maciel, CodeSorceress24.
versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex03Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        int base, altura, area;
        // entrada de dados.
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura: "));
        area = base*altura/2;
        // saída de dados.
        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
    }
}