package Lote1p1;
/* 
Programa: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
Programador: Marcela Maciel, CodeSorceress24.
versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex02Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        double salario, reajuste;
        // entrada de dados.
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário: "));
        reajuste = salario*1.15;
        // saída de dados.
        JOptionPane.showMessageDialog(null, "O novo salário com reajuste de 15% é: " + reajuste);
    }
}