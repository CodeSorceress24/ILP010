package Lote1p1;
/* 
Programa: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import javax.swing.JOptionPane;
public class Ex24Lote1p1 {
    public static void main(String[] args){
        // entrada de dados. 
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        // processamento e saída de dados.
        if (numero % 2 == 0 && numero % 3 == 0) {
            JOptionPane.showMessageDialog(null, numero + " é divisível por 2 e 3.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " não é divisível por 2 e 3.");
        }
    }
}