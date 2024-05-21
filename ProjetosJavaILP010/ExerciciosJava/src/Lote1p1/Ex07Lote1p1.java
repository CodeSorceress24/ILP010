package Lote1p1;
/* 
Programa: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex07Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        int comprimento, largura, altura, volume;
        // entrada de dados.
        comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do comprimento do paralelepípedo: "));
        largura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da largura do paralelepípedo: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do paralelepípedo: "));
        // processamento de dados.
        volume = comprimento*largura*altura;
        // saída de dados.
        JOptionPane.showMessageDialog(null, "O volume do paralelepípedo é de: " + volume + ".");
    }
}