package Lote1p1;
/* 
Programa: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex33Lote1p1{
    public static void main(String[] args) {
        // declaração de variáveis.
        int numero;
        double soma = 0.0;
        // entrada de dados.
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        for (int i = 1; i <= numero; i++) {
            soma += 1.0 / i;
        }
    // saída de dados.
    JOptionPane.showMessageDialog(null, "A soma da série é: " + soma);
    }   
}