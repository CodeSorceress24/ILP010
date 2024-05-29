package Lote1p1;
/* 
Programa: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex06Lote1p1 {
    public static void main(String[] args){
        // declaração de variáveis.
        int x, y, troca;
        // entrada de dados.
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));
        // processamento de dados.
        troca = x;
        x = y;
        y = troca;
        // saída de dados.
        JOptionPane.showMessageDialog(null, "O valor de X após a troca de conteúdo é: " + x + ", e o valor de Y após a troca é: " + y + ".");
    }
}